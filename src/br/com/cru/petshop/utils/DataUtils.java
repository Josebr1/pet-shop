package br.com.cru.petshop.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

public class DataUtils {
    public static String convertSql(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date);
    }

    public static String convertString(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);
    }

    public static Date convertDate(String date) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
    
    public static java.sql.Date convertDate(java.util.Date date) {
        if(date != null)
            return new java.sql.Date(date.getTime());
        return null;
    }
    
    public static Date convertDateTime(LocalDateTime time) {
        Date s = Date.from(time.atZone(ZoneId.systemDefault()).toInstant());
        
        System.err.println(s.getTime());
        
        return s;
    }
}
