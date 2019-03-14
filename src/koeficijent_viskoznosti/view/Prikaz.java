/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koeficijent_viskoznosti.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import koeficijent_viskoznosti.controller.Upis_citanje;
import koeficijent_viskoznosti.model.Upis;

/**
 *
 * @author Milan Dabić
 * 
 * Prozor u kom se ispisuju sacuvani rezultati prethodnih merenja
 */
public class Prikaz extends javax.swing.JFrame {

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton prikazi;
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    

    public Prikaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        prikazi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rezultati merenja");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setText("Merenja:\n");
        jTextArea1.setEditable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Izlaz");
        jButton1.setToolTipText("Izlaz iz aplikacije");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<<");
        jButton2.setToolTipText("Korak nazad");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        prikazi.setText("Prikaži");
        prikazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    prikaziActionPerformed(evt);
                } catch (IOException ex) {
                    jTextArea1.setText("Greška u čitanju fajla");
                    Logger.getLogger(Prikaz.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addGap(159, 159, 159)
                .addComponent(prikazi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(prikazi))
                .addGap(26, 26, 26))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        PotvrdaIzlaska izlaz = new PotvrdaIzlaska();
        izlaz.setLocation(dim.width/2-izlaz.getSize().width/2, dim.height/2-izlaz.getSize().height/2);
        izlaz.setVisible(true);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        KoeficijentViskoznosti kof = new KoeficijentViskoznosti();
        kof.setLocation(dim.width/2-kof.getSize().width/2, dim.height/2-kof.getSize().height/2);
        kof.setVisible(true);
    }
    
        private void prikaziActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                        
        
            
            List<Upis> rezultati=Upis_citanje.citajJson();
            int i = 1;
            for(Upis u:rezultati){
            System.out.println("vrednost======>"+u);
            String linija=u.toString();
            linija = linija.replace("Upis", "Merenje "+i+" : ").replace("{", "").replace("}", "");
            jTextArea1.append(linija+'\n');
            i++;
        }
    }  

}
