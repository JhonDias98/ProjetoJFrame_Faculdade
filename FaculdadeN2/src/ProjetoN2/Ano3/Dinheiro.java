/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoN2.Ano3;

import java.util.Random;
import javax.swing.JOptionPane;
import ProjetoN2.Ano3.calculo;

/**
 *
 * @author Jonathan Dias
 */
public class Dinheiro extends javax.swing.JFrame {
    boolean parar = true;
    int counter = 60;
    /**
     * Creates new form Dinheiro
     */
    public Dinheiro() {
        initComponents();
        btSubmit.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btSubmit = new javax.swing.JButton();
        btZerar = new javax.swing.JButton();
        btMenuAno3 = new javax.swing.JButton();
        bt200 = new javax.swing.JButton();
        bt100 = new javax.swing.JButton();
        bt50 = new javax.swing.JButton();
        bt20 = new javax.swing.JButton();
        bt10 = new javax.swing.JButton();
        bt05 = new javax.swing.JButton();
        bt02 = new javax.swing.JButton();
        bt01 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSoma = new javax.swing.JLabel();
        btStart = new javax.swing.JButton();
        lblTempo = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Valor: ");

        lblValor.setText("???");

        jLabel3.setText("Informe a Quantidade de Notas ou Moedas:");

        btSubmit.setText("Submeter");
        btSubmit.setPreferredSize(new java.awt.Dimension(80, 25));
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });

        btZerar.setText("Zerar");
        btZerar.setPreferredSize(new java.awt.Dimension(80, 25));
        btZerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btZerarActionPerformed(evt);
            }
        });

        btMenuAno3.setText("Menu");
        btMenuAno3.setPreferredSize(new java.awt.Dimension(80, 25));
        btMenuAno3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuAno3ActionPerformed(evt);
            }
        });

        bt200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjetoN2/Ano3/nota200 (Personalizado).jpg"))); // NOI18N
        bt200.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bt200.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt200ActionPerformed(evt);
            }
        });

        bt100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjetoN2/Ano3/nota100 (Personalizado).jpg"))); // NOI18N
        bt100.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bt100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt100ActionPerformed(evt);
            }
        });

        bt50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjetoN2/Ano3/nota50 (Personalizado).jpg"))); // NOI18N
        bt50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bt50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt50ActionPerformed(evt);
            }
        });

        bt20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjetoN2/Ano3/nota20 (Personalizado).jpg"))); // NOI18N
        bt20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bt20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt20ActionPerformed(evt);
            }
        });

        bt10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjetoN2/Ano3/nota10 (Personalizado).jpg"))); // NOI18N
        bt10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt10ActionPerformed(evt);
            }
        });

        bt05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjetoN2/Ano3/nota05 (Personalizado).jpg"))); // NOI18N
        bt05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bt05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt05ActionPerformed(evt);
            }
        });

        bt02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjetoN2/Ano3/nota02 (Personalizado).jpg"))); // NOI18N
        bt02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bt02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt02ActionPerformed(evt);
            }
        });

        bt01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjetoN2/Ano3/moeda01 (Personalizado).jpg"))); // NOI18N
        bt01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bt01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt01ActionPerformed(evt);
            }
        });

        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("0");
        lbl1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("0");
        lbl2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setText("0");
        lbl3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setText("0");
        lbl4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbl5.setText("0");

        lbl6.setText("0");

        lbl7.setText("0");

        lbl8.setText("0");

        jLabel2.setText("Soma:");

        lblSoma.setText("???");

        btStart.setText("Iniciar");
        btStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt200, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl1)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl5)
                                .addGap(22, 22, 22))
                            .addComponent(btMenuAno3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bt100, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bt05, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl6)
                                        .addGap(23, 23, 23)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(bt02, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(bt50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbl7)
                                        .addGap(54, 54, 54))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btStart, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btZerar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt01, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lbl8))
                            .addComponent(bt20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lbl2)
                        .addGap(79, 79, 79)
                        .addComponent(lbl3)
                        .addGap(76, 76, 76)
                        .addComponent(lbl4)))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSoma, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTempo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTempo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt100, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt200, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(lbl2)
                    .addComponent(lbl3)
                    .addComponent(lbl4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt05, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt02, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt01, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl5)
                    .addComponent(lbl6)
                    .addComponent(lbl7)
                    .addComponent(lbl8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btZerar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btStart, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMenuAno3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btZerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btZerarActionPerformed
        lbl1.setText("0");
        lbl2.setText("0");
        lbl3.setText("0");
        lbl4.setText("0");
        lbl5.setText("0");
        lbl6.setText("0");
        lbl7.setText("0");
        lbl8.setText("0");
        lblSoma.setText("???");
        calculo.soma = 0;
        btStart.setVisible(true);
        btSubmit.setVisible(false);
        parar = false;
        counter = 60;
        lblTempo.setText("TEMPO: " + (counter));
        
    }//GEN-LAST:event_btZerarActionPerformed

    private void btMenuAno3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuAno3ActionPerformed
        parar = false;
        new MenuAno3().setVisible(true);
        dispose();
    }//GEN-LAST:event_btMenuAno3ActionPerformed

    private void bt200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt200ActionPerformed
        calculo.somar(200);
        lblSoma.setText(String.format("R$ %.2f", calculo.soma));
        int cont = Integer.parseInt(lbl1.getText())+1;
        lbl1.setText(String.valueOf(cont));
    }//GEN-LAST:event_bt200ActionPerformed

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
        if(lblValor.getText().equalsIgnoreCase("???")) {  
            JOptionPane.showMessageDialog(null, "Game não foi iniciado!!");
        }
        else if (lblSoma.getText().equalsIgnoreCase("???")) {
            JOptionPane.showMessageDialog(null, "Nenhuma Nota Selecionada!!");
        }
        else {
            if (calculo.valor == calculo.soma && calculo.game == true) {
                lblValor.setText("???");
                lblSoma.setText("???");
                lbl1.setText("0");
                lbl2.setText("0");
                lbl3.setText("0");
                lbl4.setText("0");
                lbl5.setText("0");
                lbl6.setText("0");
                lbl7.setText("0");
                lbl8.setText("0");
                calculo.zerar();
                btStart.setVisible(true);
                btSubmit.setVisible(false);
                JOptionPane.showMessageDialog(null, "Parabéns a Soma esta Correta!!");
            }
            else {
                lblValor.setText("???");
                lblSoma.setText("???");
                lbl1.setText("0");
                lbl2.setText("0");
                lbl3.setText("0");
                lbl4.setText("0");
                lbl5.setText("0");
                lbl6.setText("0");
                lbl7.setText("0");
                lbl8.setText("0");
                calculo.zerar();
                btStart.setVisible(true);
                btSubmit.setVisible(false);
                JOptionPane.showMessageDialog(null, "Não Foi desta vez, \nTente Novamente!!");
                parar = false;
                counter = 60;
                lblTempo.setText("TEMPO: " + (counter));
            }
        }
        calculo.endGame();
        parar = false;
    }//GEN-LAST:event_btSubmitActionPerformed
    

    private void bt100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt100ActionPerformed
        calculo.somar(100);
        lblSoma.setText(String.format("R$ %.2f", calculo.soma));
        int cont = Integer.parseInt(lbl2.getText())+1;
        lbl2.setText(String.valueOf(cont));
    }//GEN-LAST:event_bt100ActionPerformed

    private void bt50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt50ActionPerformed
        calculo.somar(50);
        lblSoma.setText(String.format("R$ %.2f", calculo.soma));
        int cont = Integer.parseInt(lbl3.getText())+1;
        lbl3.setText(String.valueOf(cont));
    }//GEN-LAST:event_bt50ActionPerformed

    private void bt20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt20ActionPerformed
        calculo.somar(20);
        lblSoma.setText(String.format("R$ %.2f", calculo.soma));
        int cont = Integer.parseInt(lbl4.getText())+1;
        lbl4.setText(String.valueOf(cont));
    }//GEN-LAST:event_bt20ActionPerformed

    private void bt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt10ActionPerformed
        calculo.somar(10);
        lblSoma.setText(String.format("R$ %.2f", calculo.soma));
        int cont = Integer.parseInt(lbl5.getText())+1;
        lbl5.setText(String.valueOf(cont));
    }//GEN-LAST:event_bt10ActionPerformed

    private void bt05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt05ActionPerformed
        calculo.somar(5);
        lblSoma.setText(String.format("R$ %.2f", calculo.soma));
        int cont = Integer.parseInt(lbl6.getText())+1;
        lbl6.setText(String.valueOf(cont));
    }//GEN-LAST:event_bt05ActionPerformed

    private void bt02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt02ActionPerformed
        calculo.somar(2);
        lblSoma.setText(String.format("R$ %.2f", calculo.soma));
        int cont = Integer.parseInt(lbl7.getText())+1;
        lbl7.setText(String.valueOf(cont));
    }//GEN-LAST:event_bt02ActionPerformed

    private void bt01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt01ActionPerformed
        calculo.somar(1);
        lblSoma.setText(String.format("R$ %.2f", calculo.soma));
        int cont = Integer.parseInt(lbl8.getText())+1;
        lbl8.setText(String.valueOf(cont));
    }//GEN-LAST:event_bt01ActionPerformed

    private void btStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStartActionPerformed
        
        parar = true;
        new Thread() {
        
        public void run() {
            while(counter >= 0 && parar) {
                lblTempo.setText("TEMPO: " + (counter--));
                try{
                    Thread.sleep(1000);
                } catch(Exception e) {}
                if(counter == 0) {
                    JOptionPane.showMessageDialog(null, "TEMPO ESGOTADO");
                }
            }    
        }
        }.start();
        
        Random rand = new Random();
        double valor = rand.nextInt(1000);
        lblValor.setText(String.format("R$ %.2f", valor));
        calculo.valor = valor;
        calculo.startGame();
        btStart.setVisible(false);
        btSubmit.setVisible(true);
    }//GEN-LAST:event_btStartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dinheiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt01;
    private javax.swing.JButton bt02;
    private javax.swing.JButton bt05;
    private javax.swing.JButton bt10;
    private javax.swing.JButton bt100;
    private javax.swing.JButton bt20;
    private javax.swing.JButton bt200;
    private javax.swing.JButton bt50;
    private javax.swing.JButton btMenuAno3;
    private javax.swing.JButton btStart;
    private javax.swing.JButton btSubmit;
    private javax.swing.JButton btZerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lblSoma;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JLabel lblValor;
    // End of variables declaration//GEN-END:variables
}
