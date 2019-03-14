/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koeficijent_viskoznosti.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import koeficijent_viskoznosti.model.Kuglica;

/**
 *
 * @author Milan Dabić
 * 
 * Prozor u kom se racuna precnik kuglice kao prosecna vrednost tri merenja
 */
public class PrecnikKuglice extends javax.swing.JFrame {

    private javax.swing.JLabel greska;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton prihvati;
    private double pr1, pr2, pr3;
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    public PrecnikKuglice() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        greska = new javax.swing.JLabel();
        prihvati = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Unesite parametre kuglice");

        jLabel2.setText("Prečnik meren u 3 ortogonalna pravca zaokružen na 2 decimale :");

        jTextField1.setText("00.00");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("mm");

        jTextField3.setText("00.00");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel6.setText("mm");

        jTextField4.setText("00.00");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel7.setText("mm");

        jButton1.setText("odustani");
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

        greska.setForeground(new java.awt.Color(255, 0, 51));
        greska.setText("Greška");
        greska.setVisible(false);

        prihvati.setText("Prihvati");
        prihvati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prihvatiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel7))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel6))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel3))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(prihvati)
                                                                .addGap(7, 7, 7)))
                                                .addGap(0, 85, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(greska, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton2)))
                                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2))
                                        .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addGap(38, 38, 38)
                                .addComponent(prihvati)
                                .addGap(18, 18, 18)
                                .addComponent(greska)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addGap(26, 26, 26))
        );

        pack();
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

        String precnik1 = jTextField1.getText();
        precnik1 = precnik1.replace(",", ".").replace(" ", "");
        Pattern p = Pattern.compile("^[0-9]{1,2}.[0-9]{2,2}$");
        Matcher m = p.matcher(precnik1);
        if (m.find()) {
            try {
                double r21 = Double.parseDouble(precnik1);
                this.pr1 = r21;
                System.out.println(r21);
                greska.setVisible(false);
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                greska.setText("*** Podatak nije prihvaćen ***");
                greska.setVisible(true);
            }

        } else {
            jTextField1.setText("??.??");
            greska.setText("*** Uneli ste podatak u pogrešnom formatu ***");
            greska.setVisible(true);
        }

    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {

        String precnik2 = jTextField3.getText();
        precnik2 = precnik2.replace(",", ".").replace(" ", "");
        Pattern p = Pattern.compile("^[0-9]{1,2}.[0-9]{2,2}$");
        Matcher m = p.matcher(precnik2);
        if (m.find()) {
            try {
                double r22 = Double.parseDouble(precnik2);
                this.pr2 = r22;
                System.out.println(r22);
                greska.setVisible(false);
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                greska.setText("*** Podatak nije prihvaćen ***");
                greska.setVisible(true);
            }

        } else {
            jTextField3.setText("??.??");
            greska.setText("*** Uneli ste podatak u pogrešnom formatu ***");
            greska.setVisible(true);
        }
    }

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {

        String precnik3 = jTextField4.getText();
        precnik3 = precnik3.replace(",", ".").replace(" ", "");
        Pattern p = Pattern.compile("^[0-9]{1,2}.[0-9]{2,2}$");
        Matcher m = p.matcher(precnik3);
        if (m.find()) {
            try {
                double r23 = Double.parseDouble(precnik3);
                this.pr3 = r23;
                System.out.println(r23);
                greska.setVisible(false);
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                greska.setText("*** Podatak nije prihvaćen ***");
                greska.setVisible(true);
            }

        } else {
            jTextField4.setText("??.??");
            greska.setText("*** Uneli ste podatak u pogrešnom formatu ***");
            greska.setVisible(true);
        }

    }

    private void prihvatiActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.pr1 > 0 && this.pr2 > 0 && this.pr3 > 0) {
            double precnik = (this.pr1 + this.pr2 + this.pr3) / 3;
            Kuglica.setPrecnikKuglice(precnik);
            System.out.println("precnik: " + precnik);
            dispose();
            KoeficijentViskoznosti kof = new KoeficijentViskoznosti();
            kof.setLocation(dim.width / 2 - kof.getSize().width / 2, dim.height / 2 - kof.getSize().height / 2);
            kof.setVisible(true);

        } else {

            greska.setText("*** Pogrešno ste uneli podatak u jedno ili više polja ***");
            greska.setVisible(true);

        }

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        PotvrdaIzlaska izlaz = new PotvrdaIzlaska();
        izlaz.setLocation(dim.width / 2 - izlaz.getSize().width / 2, dim.height / 2 - izlaz.getSize().height / 2);
        izlaz.setVisible(true);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        MaterijalKuglice mat = new MaterijalKuglice();
        mat.setLocation(dim.width / 2 - mat.getSize().width / 2, dim.height / 2 - mat.getSize().height / 2);
        mat.setVisible(true);
    }

}
