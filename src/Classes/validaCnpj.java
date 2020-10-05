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
public class validaCnpj {
    
    public static boolean isCnpj(String c){
        if(c.equals("111111111111111")|| c.equals("22222222222222")|| c.equals("33333333333333")||
                c.equals("44444444444444")|| c.equals("55555555555555")|| c.equals("66666666666666")||
                c.equals("77777777777777")|| c.equals("88888888888888")|| c.equals("99999999999999")|| (c.length()!=14)){
            return (false);
        }
        
        char v1, v2;
        int sm, i, r, num, peso;
        try{
            sm = 0; peso = 2;
            for(i=11; i>=0; i--){
                num = (int) (c.charAt(i)) - 48;
                sm = sm + (num*peso);
                peso = peso+1;
                if(peso==10) peso=2;
            }
            r = sm%11;
            if((r==0) || (r==1)) v1 = '0';
            else v1 = (char) ((11-r)+48);
            
            sm = 0; peso = 2;
            for(i=12; i>=0; i--){
                num = (int) (c.charAt(i)) - 48;
                sm = sm + (num*peso);
                peso = peso +1;
                if(peso==10) peso=2;
            }
            r = sm%11;
            if((r==0) || (r==1)) v2 = '0';
            else v2 = (char) ((11-r)+48);
            
            if((v1 == c.charAt(12)) && v2 == c.charAt(13)) return (true);
            else return (false);
        }catch (InputMismatchException erro){
            return (false);
        }
        
    }
    
}
