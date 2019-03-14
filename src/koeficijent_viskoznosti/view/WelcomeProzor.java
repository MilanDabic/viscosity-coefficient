/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koeficijent_viskoznosti.view;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Milan Dabić
 * 
 * Prozor u kome se objasnjava svrha programa i potvrdjuje pokretanje postupka proracuna
 */
public class WelcomeProzor extends javax.swing.JFrame {
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    public WelcomeProzor() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
                       
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kalkulator koeficijenta viskoznosti tecnosti");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Svrha ove aplikacije je da pomogne u izvođenju laboratorijske vežbe računanja\nkoeficijenta viskoznosti tečnosti.\nU narednim koracima unesite parametre koji su potrebni za računanje.\nNakon svakog unosa numeričkog podatka pritisnite ENTER.");
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Potvrdi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Odustani");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(43, 43, 43))
        );

        jLabel1.getAccessibleContext().setAccessibleName("");

        pack();
    }                      

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {  
                PotvrdaIzlaska izlaz=new PotvrdaIzlaska();
                izlaz.setLocation(dim.width/2-izlaz.getSize().width/2, dim.height/2-izlaz.getSize().height/2);
        izlaz.setVisible(true);
        
        
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        dispose();
        TecnostProzor tec=new TecnostProzor();
        tec.setLocation(dim.width/2-tec.getSize().width/2, dim.height/2-tec.getSize().height/2);
        tec.setVisible(true);
    }                                        

 

                  
}
