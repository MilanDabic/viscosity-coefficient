/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koeficijent_viskoznosti.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import koeficijent_viskoznosti.model.Kuglica;

/**
 *
 * @author Milan Dabić
 * 
 * Prozor u kom se bira materijal kuglice
 */
public class MaterijalKuglice extends javax.swing.JFrame {

    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton10;
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    public MaterijalKuglice() {
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
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Izaberite materijal kuglice");

        jButton1.setText("Gvožđe");
        jButton1.setMaximumSize(new java.awt.Dimension(186, 43));
        jButton1.setMinimumSize(new java.awt.Dimension(186, 43));
        jButton1.setPreferredSize(new java.awt.Dimension(186, 43));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Bakar");
        jButton2.setMaximumSize(new java.awt.Dimension(186, 43));
        jButton2.setMinimumSize(new java.awt.Dimension(186, 43));
        jButton2.setPreferredSize(new java.awt.Dimension(186, 43));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Aluminijum");
        jButton3.setMaximumSize(new java.awt.Dimension(186, 43));
        jButton3.setMinimumSize(new java.awt.Dimension(186, 43));
        jButton3.setPreferredSize(new java.awt.Dimension(186, 43));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Olovo");
        jButton4.setMaximumSize(new java.awt.Dimension(186, 43));
        jButton4.setMinimumSize(new java.awt.Dimension(186, 43));
        jButton4.setPreferredSize(new java.awt.Dimension(186, 43));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Kalaj");
        jButton5.setMaximumSize(new java.awt.Dimension(186, 43));
        jButton5.setMinimumSize(new java.awt.Dimension(186, 43));
        jButton5.setPreferredSize(new java.awt.Dimension(186, 43));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Srebro");
        jButton6.setMaximumSize(new java.awt.Dimension(186, 43));
        jButton6.setMinimumSize(new java.awt.Dimension(186, 43));
        jButton6.setPreferredSize(new java.awt.Dimension(186, 43));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Zlato");
        jButton7.setMaximumSize(new java.awt.Dimension(186, 43));
        jButton7.setMinimumSize(new java.awt.Dimension(186, 43));
        jButton7.setPreferredSize(new java.awt.Dimension(186, 43));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Odustani");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("<<");
        jButton9.setToolTipText("Korak nazad");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Nepoznat materijal");
        jButton10.setMaximumSize(new java.awt.Dimension(186, 43));
        jButton10.setMinimumSize(new java.awt.Dimension(186, 43));
        jButton10.setPreferredSize(new java.awt.Dimension(186, 43));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(71, 71, 71)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton8)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton9))
                                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton8)
                                        .addComponent(jButton9))
                                .addGap(26, 26, 26))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Kuglica.setMaterijal_kuglice("Gvožđe");
        Kuglica.setGustinaKuglice(Kuglica.GUSTINA_FE);
        Kuglica.setGreskaKuglice(0.02);
        dispose();
        PrecnikKuglice prec = new PrecnikKuglice();
        prec.setLocation(dim.width / 2 - prec.getSize().width / 2, dim.height / 2 - prec.getSize().height / 2);
        prec.setVisible(true);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        Kuglica.setMaterijal_kuglice("Bakar");
        Kuglica.setGustinaKuglice(Kuglica.GUSTINA_CU);
        Kuglica.setGreskaKuglice(0.02);
        dispose();
        PrecnikKuglice prec = new PrecnikKuglice();
        prec.setLocation(dim.width / 2 - prec.getSize().width / 2, dim.height / 2 - prec.getSize().height / 2);
        prec.setVisible(true);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        Kuglica.setMaterijal_kuglice("Aluminijum");
        Kuglica.setGustinaKuglice(Kuglica.GUSTINA_AL);
        Kuglica.setGreskaKuglice(0.02);
        dispose();
        PrecnikKuglice prec = new PrecnikKuglice();
        prec.setLocation(dim.width / 2 - prec.getSize().width / 2, dim.height / 2 - prec.getSize().height / 2);
        prec.setVisible(true);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        Kuglica.setMaterijal_kuglice("Olovo");
        Kuglica.setGustinaKuglice(Kuglica.GUSTINA_PB);
        Kuglica.setGreskaKuglice(0.02);
        dispose();
        PrecnikKuglice prec = new PrecnikKuglice();
        prec.setLocation(dim.width / 2 - prec.getSize().width / 2, dim.height / 2 - prec.getSize().height / 2);
        prec.setVisible(true);
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        Kuglica.setMaterijal_kuglice("Kalaj");
        Kuglica.setGustinaKuglice(Kuglica.GUSTINA_SN);
        Kuglica.setGreskaKuglice(0.02);
        dispose();
        PrecnikKuglice prec = new PrecnikKuglice();
        prec.setLocation(dim.width / 2 - prec.getSize().width / 2, dim.height / 2 - prec.getSize().height / 2);
        prec.setVisible(true);
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        Kuglica.setMaterijal_kuglice("Srebro");
        Kuglica.setGustinaKuglice(Kuglica.GUSTINA_AG);
        Kuglica.setGreskaKuglice(0.02);
        dispose();
        PrecnikKuglice prec = new PrecnikKuglice();
        prec.setLocation(dim.width / 2 - prec.getSize().width / 2, dim.height / 2 - prec.getSize().height / 2);
        prec.setVisible(true);
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        Kuglica.setMaterijal_kuglice("Zlato");
        Kuglica.setGustinaKuglice(Kuglica.GUSTINA_AU);
        Kuglica.setGreskaKuglice(0.02);
        dispose();
        PrecnikKuglice prec = new PrecnikKuglice();
        prec.setLocation(dim.width / 2 - prec.getSize().width / 2, dim.height / 2 - prec.getSize().height / 2);
        prec.setVisible(true);
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        PotvrdaIzlaska izlaz = new PotvrdaIzlaska();
        izlaz.setLocation(dim.width / 2 - izlaz.getSize().width / 2, dim.height / 2 - izlaz.getSize().height / 2);
        izlaz.setVisible(true);
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        TecnostProzor tec = new TecnostProzor();
        tec.setLocation(dim.width / 2 - tec.getSize().width / 2, dim.height / 2 - tec.getSize().height / 2);
        tec.setVisible(true);
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        NepoznatMaterijal nmtr = new NepoznatMaterijal();
        nmtr.setLocation(dim.width / 2 - nmtr.getSize().width / 2, dim.height / 2 - nmtr.getSize().height / 2);
        nmtr.setVisible(true);
    }

}
