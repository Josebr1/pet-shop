/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.InputMismatchException;

/**
 *
 * @author trabalhor
 */
public class validaCpf {
    public static boolean isCpf(String c){
        if(c.equals("00000000000") || 
                c.equals("11111111111") || c.equals("44444444444") || c.equals("99999999999") || 
                c.equals("22222222222") || c.equals("55555555555") || c.equals("88888888888") || 
                c.equals("33333333333") || c.equals("66666666666") || c.equals("77777777777") || (c.length()!=11)){
            
            return (false);
        }
        
        char v1, v2;
        int sm, i, r, num, peso;
        
        try{
            sm=0;
            peso=10;
            for(i=0;i<9;i++){
                num= (int) (c.charAt(i) - 48);
                sm = sm + (num*peso);
                peso = peso -1;
            }
            r = 11-(sm%11);
            if((r == 10) || r==11) v1='0';
            else v1=(char) (r+48);
            
            sm=0;
            peso=11;
            for(i=0;i<10;i++){
                num= (int) (c.charAt(i) - 48);
                sm = sm + (num*peso);
                peso = peso -1;
            }
            r = 11-(sm%11);
            if((r == 10) || r==11) v2='0';
            else v2=(char) (r+48);
            
            if((v1==c.charAt(9)) && (v2==c.charAt(10))){
                return (true);
            }
            else return (false);
        }
        catch (InputMismatchException erro){
            return (false);
        }
    }
}
