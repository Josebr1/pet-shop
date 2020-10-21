package br.com.cru.petshop.utils;

import com.mysql.cj.util.StringUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordUtils {
    private static final Pattern VALID_PASSWORD_REGEX =
            Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
    
    public static boolean validate(String passwordStr) {
        if(StringUtils.isNullOrEmpty(passwordStr)) return false;
        Matcher matcher = VALID_PASSWORD_REGEX.matcher(passwordStr);
        return matcher.find();
    }
}
