/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koeficijent_viskoznosti.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import koeficijent_viskoznosti.model.Rezultat;
import koeficijent_viskoznosti.model.Suma;
import koeficijent_viskoznosti.model.Tecnost;
import koeficijent_viskoznosti.model.Upis;
import koeficijent_viskoznosti.controller.Upis_citanje;

/**
 *
 * @author Milan Dabić
 * 
 * Prozor za prikaz izracunatog koeficijenta viskoznosti
 */
public class RezultatProzor extends javax.swing.JFrame {

    private javax.swing.JLabel greska;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblGreska;
    private javax.swing.JLabel lblKoeficijent;
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    public void promeniGresku() {
        greska.setText("Pokušavate da izmenite nepostojeći fajl");
        greska.setVisible(false);

    }

    public RezultatProzor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblKoeficijent = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblGreska = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        greska = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rezultat");

        jLabel2.setText("Koeficijent viskoznosti za izabranu tečnost je =");

        DecimalFormat dcf = new DecimalFormat("#.##");

        lblKoeficijent.setText(dcf.format(Rezultat.getEta()));

        jLabel3.setText("+-");

        lblGreska.setText(dcf.format(Rezultat.getGreska()));

        jLabel4.setText("Pas");

        jButton1.setText("Sačuvaj merenja");
        jButton1.setActionCommand(" Sačuvaj merenja ");
        jButton1.setMaximumSize(new java.awt.Dimension(167, 31));
        jButton1.setMinimumSize(new java.awt.Dimension(167, 31));
        jButton1.setPreferredSize(new java.awt.Dimension(167, 31));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(RezultatProzor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        jButton2.setText("Prethodna merenja");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        greska.setForeground(new java.awt.Color(255, 0, 51));
        greska.setText("Greška");
        greska.setVisible(false);

        //Proveravamo da li je izracunata vrednost u okvirima tabelarne
        if ((Rezultat.getEta() - Rezultat.getGreska() > Tecnost.getOcekivanaVrednostEta()) | (Rezultat.getEta() + Rezultat.getGreska() < Tecnost.getOcekivanaVrednostEta())) {
            greska.setVisible(true);
            greska.setText("Izračunata vrednost nije u granicama očekivane za izabranu tečnost");
        }

        jButton3.setToolTipText("Izlaz iz aplikacije");
        jButton3.setText("Izlaz");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("<<");
        jButton4.setToolTipText("Korak nazad");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setToolTipText("Uradite vežbu ponovo");
        jButton5.setText("Početak");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
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
                                                .addGap(79, 79, 79)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(107, 107, 107)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lblKoeficijent)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lblGreska)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel4)))
                                                .addGap(78, 78, 78)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(greska, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton3)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton4)))
                                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(lblKoeficijent)
                                        .addComponent(jLabel3)
                                        .addComponent(lblGreska)
                                        .addComponent(jLabel4))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(greska)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton3)
                                        .addComponent(jButton4)
                                        .addComponent(jButton5))
                                .addGap(26, 26, 26))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        Upis r1 = new Upis();
        r1.setVrstaTecnosti(Tecnost.getNaziv_tecnosti());
        r1.setEta(Rezultat.getEta());
        r1.setGreska(Rezultat.getGreska());
        r1.setBrojMerenja(Rezultat.getBrojMerenja());

        //provera da li postoji json fajl i prema tome odabir metode za upis
        File f = new File("koeficijent_viskoznosti.json");
        if (f.exists() && !f.isDirectory()) {
            Upis_citanje.upisiUPostojeciJson(r1);
        } else {

            List<Upis> rezultati = new ArrayList<>();
            rezultati.add(r1);
            Upis_citanje.upisiUJson(rezultati);

        }

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        Prikaz mer = new Prikaz();
        mer.setLocation(dim.width / 2 - mer.getSize().width / 2, dim.height / 2 - mer.getSize().height / 2);
        mer.setVisible(true);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        PotvrdaIzlaska izlaz = new PotvrdaIzlaska();
        izlaz.setLocation(dim.width / 2 - izlaz.getSize().width / 2, dim.height / 2 - izlaz.getSize().height / 2);
        izlaz.setVisible(true);
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        Suma.brojac = 0;
        Suma.suma = 0;
        TecnostProzor tec = new TecnostProzor();
        tec.setLocation(dim.width / 2 - tec.getSize().width / 2, dim.height / 2 - tec.getSize().height / 2);
        tec.setVisible(true);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        KoeficijentViskoznosti kof = new KoeficijentViskoznosti();
        kof.setLocation(dim.width / 2 - kof.getSize().width / 2, dim.height / 2 - kof.getSize().height / 2);
        Suma.brojac = 0;
        Suma.suma = 0;
        kof.setVisible(true);
    }

}
