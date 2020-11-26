/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoN2.Ano4;

import java.util.Random;

/**
 *
 * @author Danilo
 */
public class Calculo {
    //  Form Multiplicacao
    
    public static String multi(String num1, String num2) {
        int num3 = Integer.parseInt(num1);
        int num4 = Integer.parseInt(num2);
        String result = String.valueOf(num3 * num4);
        return result;
    }
    
    public static int numRand99 () {
        Random rand = new Random();
        
        int num = rand.nextInt(99);
        return num;
    }
    
    public static int numRand10 () {
        Random rand = new Random();
        
        int num = rand.nextInt(10);
        return num;
    }
    
    //  Form Medidas
    
    public static int tmpRand () {
        Random rand = new Random();
        
            int num = rand.nextInt(14);

            if (num == 0) {
                num = 1;
            }
        return num*10;
    }
    
    public static String aumentaTmp(String tmp) {
        int num = Integer.parseInt(tmp);
        
        if (num < 140) {
            num += 10;
            tmp = String.valueOf(num);
        }
        return tmp;
    }
    
    public static String diminuiTmp(String tmp) {
        int num = Integer.parseInt(tmp);
        
        if ( num > 10) {
            num -= 10;
            tmp = String.valueOf(num);
        }
        return tmp;
    }
}
