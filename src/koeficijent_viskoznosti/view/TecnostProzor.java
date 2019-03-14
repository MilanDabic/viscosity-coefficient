/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koeficijent_viskoznosti.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import koeficijent_viskoznosti.model.OcekivaneVrednosti;
import koeficijent_viskoznosti.model.Tecnost;

/**
 *
 * @author Milan Dabić
 * 
 * Prozor u kom se vrsi odabir tecnosti za vezbu
 */
public class TecnostProzor extends javax.swing.JFrame {

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    public TecnostProzor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Izaberite tečnost");

        jButton1.setText("Glicerin");
        jButton1.setMaximumSize(new java.awt.Dimension(186, 43));
        jButton1.setMinimumSize(new java.awt.Dimension(186, 43));
        jButton1.setPreferredSize(new java.awt.Dimension(186, 43));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Alkohol");
        jButton2.setMaximumSize(new java.awt.Dimension(186, 43));
        jButton2.setMinimumSize(new java.awt.Dimension(186, 43));
        jButton2.setPreferredSize(new java.awt.Dimension(186, 43));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Voda");
        jButton3.setMaximumSize(new java.awt.Dimension(186, 43));
        jButton3.setMinimumSize(new java.awt.Dimension(186, 43));
        jButton3.setPreferredSize(new java.awt.Dimension(186, 43));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Motorno ulje");
        jButton4.setMaximumSize(new java.awt.Dimension(186, 43));
        jButton4.setMinimumSize(new java.awt.Dimension(186, 43));
        jButton4.setPreferredSize(new java.awt.Dimension(186, 43));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Odustani");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("<<");
        jButton6.setToolTipText("Korak nazad");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(220, 220, 220))))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(26, 26, 26))
        );

        pack();
    }                     

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Tecnost.setNaziv_tecnosti("Glicerin");
        Tecnost.setGustina(Tecnost.GUSTINA_GLICERINA);
        Tecnost.setOcekivanaVrednostEta(OcekivaneVrednosti.getGLICERIN());
        dispose();
        MaterijalKuglice matk = new MaterijalKuglice();
        matk.setLocation(dim.width/2-matk.getSize().width/2, dim.height/2-matk.getSize().height/2);
        matk.setVisible(true);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
                Tecnost.setNaziv_tecnosti("Alkohol");
        Tecnost.setGustina(Tecnost.GUSTINA_ALKOHOLA);
        Tecnost.setOcekivanaVrednostEta(OcekivaneVrednosti.getALKOHOL());
        dispose();
        MaterijalKuglice matk = new MaterijalKuglice();
        matk.setLocation(dim.width/2-matk.getSize().width/2, dim.height/2-matk.getSize().height/2);
        matk.setVisible(true);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        Tecnost.setNaziv_tecnosti("Voda");
        Tecnost.setGustina(Tecnost.GUSTINA_VODE);
        Tecnost.setOcekivanaVrednostEta(OcekivaneVrednosti.getVODA());
        dispose();
        MaterijalKuglice matk = new MaterijalKuglice();
        matk.setLocation(dim.width/2-matk.getSize().width/2, dim.height/2-matk.getSize().height/2);
        matk.setVisible(true);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        Tecnost.setNaziv_tecnosti("Motorno ulje");
        Tecnost.setGustina(Tecnost.GUSTINA_ULJA);
        Tecnost.setOcekivanaVrednostEta(OcekivaneVrednosti.getULJE());
        dispose();
        MaterijalKuglice matk = new MaterijalKuglice();
        matk.setLocation(dim.width/2-matk.getSize().width/2, dim.height/2-matk.getSize().height/2);
        matk.setVisible(true);
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        //setVisible(false);
        PotvrdaIzlaska izlaz = new PotvrdaIzlaska();
        izlaz.setLocation(dim.width/2-izlaz.getSize().width/2, dim.height/2-izlaz.getSize().height/2);
        izlaz.setVisible(true);
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        WelcomeProzor wpr = new WelcomeProzor();
        wpr.setLocation(dim.width/2-wpr.getSize().width/2, dim.height/2-wpr.getSize().height/2);
        wpr.setVisible(true);
    }

}
