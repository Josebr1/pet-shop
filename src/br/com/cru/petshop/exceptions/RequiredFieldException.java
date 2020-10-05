package br.com.cru.petshop.exceptions;

public class RequiredFieldException extends ShowableException{
    private String fieldName;

    public RequiredFieldException(String fieldName, String localisedErrorMessage) {
        this.fieldName = fieldName;
    }

    public RequiredFieldException(String fieldName) {
        this.fieldName = fieldName;
    }
    @Override
    public String toString() {
        return fieldName;
    }
}
