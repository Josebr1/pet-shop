package br.com.cru.petshop.validations;

import br.com.cru.petshop.annotations.CNPJ;
import br.com.cru.petshop.annotations.Email;
import br.com.cru.petshop.annotations.MaskRequired;
import br.com.cru.petshop.annotations.Password;
import br.com.cru.petshop.annotations.Required;
import br.com.cru.petshop.exceptions.RequiredFieldException;
import br.com.cru.petshop.utils.DocumentUtils;
import br.com.cru.petshop.utils.EmailUtils;
import br.com.cru.petshop.utils.BCrypt;
import br.com.cru.petshop.utils.PasswordUtils;
import com.mysql.cj.util.StringUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Validator {
    
    public static boolean validateForNulls(Object objectToValidate) throws RequiredFieldException, IllegalAccessException {
        Field[] declaredFields = objectToValidate.getClass().getDeclaredFields();

        List<String> listErrors = new ArrayList<>();
        for(Field field : declaredFields) {

            Annotation requiredAnnotation = field.getAnnotation(Required.class);
            Annotation emailAnnotation = field.getAnnotation(Email.class);
            Annotation passwordAnnotation = field.getAnnotation(Password.class);
            Annotation cnpjAnnotation = field.getAnnotation(CNPJ.class);
            Annotation maskRequiredAnnotation = field.getAnnotation(MaskRequired.class);

            if (requiredAnnotation != null) {
                Required required = (Required) requiredAnnotation;
                if (required.value()) {
                    field.setAccessible(true);

                    String msgError = "Preenchimento do campo " +
                            field.getName().substring(0, 1).toUpperCase() +
                            field.getName().substring(1) +
                            " é obrigatório";
                    
                    if (field.get(objectToValidate) instanceof String)
                        if(StringUtils.isNullOrEmpty((String) field.get(objectToValidate))) listErrors.add(msgError);

                    if (field.get(objectToValidate) == null)  listErrors.add(msgError);
                }
            }
            
            if (maskRequiredAnnotation != null) {
                MaskRequired required = (MaskRequired) maskRequiredAnnotation;
                if (required.value()) {
                    field.setAccessible(true);

                    String msgError = "Preenchimento do campo " +
                            field.getName().substring(0, 1).toUpperCase() +
                            field.getName().substring(1) +
                            " é obrigatório";
                    
                    if (field.get(objectToValidate) instanceof String)
                        if(StringUtils.isNullOrEmpty(((String) field.get(objectToValidate)).replaceAll("[^0-9+]", ""))) listErrors.add(msgError);

                    if (field.get(objectToValidate) == null)  listErrors.add(msgError);
                }
            }
            
            if (emailAnnotation != null) {
                Email email = (Email) emailAnnotation;
                if(email.value()){
                    field.setAccessible(true);
                    String msgError = "E-mail fornecido é invalido";
                    if (!EmailUtils.validate((String) field.get(objectToValidate)))
                        listErrors.add(msgError);
                }
            }

            if(passwordAnnotation != null) {
                Password password = (Password) passwordAnnotation;

                if (password.value()) {
                    field.setAccessible(true);
                    String msgError = "A senha fornecida é muito fraca. Ex. de Senha: 123@Mudar";
                    if(!PasswordUtils.validate((String) field.get(objectToValidate)))
                        listErrors.add(msgError);
                }
            }

            if (cnpjAnnotation != null) {
                CNPJ cnpj = (CNPJ) cnpjAnnotation;

                if(cnpj.value()) {
                    field.setAccessible(true);
                    String msgError = "Erro, CNPJ invalido !!!";
                    if(!DocumentUtils.isCNPJ((String) field.get(objectToValidate)))
                        listErrors.add(msgError);
                }
            }
        }
        if(listErrors.size() > 0)
            throw new RequiredFieldException(String.join("\n", listErrors));
        return true;
    }
    
}
