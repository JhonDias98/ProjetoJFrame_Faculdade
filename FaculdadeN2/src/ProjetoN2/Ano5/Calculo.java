/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoN2.Ano5;

import java.util.Random;

/**
 *
 * @author Danilo
 */
public class Calculo {
    //  Form Multiplicacao
    
    public static String multi(String num1, String num2, String num0) {
        int num3 = Integer.parseInt(num1);
        int num4 = Integer.parseInt(num2);
        int num5 = Integer.parseInt(num0);
        String result = String.valueOf(num3 * num4 * num5);
        return result;
    }
    
    public static int numRand50 () {
        Random rand = new Random();
        
        int num = rand.nextInt(50);
        return num;
    }
    
    public static int numRand10 () {
        Random rand = new Random();
        
        int num = rand.nextInt(10);
        return num;
    }
    
    public static int numRand5 () {
        Random rand = new Random();
        
        int num = rand.nextInt(5);
        return num;
    }
}
