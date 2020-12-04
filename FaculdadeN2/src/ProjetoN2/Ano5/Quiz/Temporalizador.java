package ProjetoN2.Ano5.Quiz;

import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class Temporalizador {
    public static boolean rodar;
    public static int counter = 10;
    public static int contador = 10;
    private Runnable thread1 = new Runnable() {
        @Override
            public void run() {
               while(counter >= 0 && rodar) {
                counter--;
                System.out.println(counter);
                if(counter == 0) {
                    JOptionPane.showMessageDialog(null, "TEMPO ESGOTADO"); 
                } 
                try{
                    Thread.sleep(1000);
                } catch(Exception e) {}
            }
                      
        }        
    }; 
    private Thread thread1Time;
    
    public void iniciar() {
        Temporalizador.rodar = true;
        thread1Time = new Thread(thread1);
        thread1Time.start();
    }
    
    public void parar() {
        Temporalizador.rodar = false;
    }
}

