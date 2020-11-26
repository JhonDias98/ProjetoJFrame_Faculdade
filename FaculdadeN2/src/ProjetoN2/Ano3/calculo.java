/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoN2.Ano3;

import java.util.Random;

/**
 *
 * @author Danilo
 */
public class calculo {
    public static double soma = 0;
    public static double valor = 0;
    public static boolean game;
    
    public static boolean startGame() {
        game = true;
        return game;
    }
    public static boolean endGame() {
        game = false;
        return game;
    }
    
    public static void somar(int nota) {
        soma = soma + nota;
    }
    
    public static void zerar() {
        valor = 0;
        soma = 0;
    }
    
    public static double numRand() {
        Random rand = new Random();
        double valor = rand.nextDouble();
        int valor1 = rand.nextInt(9);
        valor = valor + valor1;
        return valor;
    }
}
