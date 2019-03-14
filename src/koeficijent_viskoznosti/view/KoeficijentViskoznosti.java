/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koeficijent_viskoznosti.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import koeficijent_viskoznosti.controller.Operacije;
import koeficijent_viskoznosti.model.Kuglica;
import koeficijent_viskoznosti.model.Rezultat;
import koeficijent_viskoznosti.model.Tecnost;
import koeficijent_viskoznosti.model.Vreme;

/**
 *
 * @author Milan Dabić
 * 
 * Prozor u kom se bira broj ponavljanja vezbe i unose podaci za jedno ponavljanje
 */
public class KoeficijentViskoznosti extends javax.swing.JFrame {


    private javax.swing.JLabel greska;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton stoperica;
    private javax.swing.JLabel lblGustinaK;
    private javax.swing.JLabel lblGustinaT;
    private javax.swing.JLabel lblPPutTxt;
    private javax.swing.JLabel lblPrecnik;
    private javax.swing.JLabel lblVremeTxt;
    private javax.swing.JButton potvrdi;
    private javax.swing.JLabel vreme;
    private javax.swing.JButton izracunaj;
    private int pPut;
    private long start;
    private long interval;
    double izmerenoVreme;
    boolean off;
    int n=1;
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    public KoeficijentViskoznosti() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {


        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblGustinaT = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblGustinaK = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPrecnik = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        lblPPutTxt = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblVremeTxt = new javax.swing.JLabel();
        stoperica = new javax.swing.JButton();
        potvrdi = new javax.swing.JButton();
        vreme = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        greska = new javax.swing.JLabel();
        izracunaj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Unesite preostale parametre za računanje koeficijenta viskoznosti");

        jLabel2.setText("Gustina tečnosti =");

        lblGustinaT.setText(String.valueOf(Tecnost.getGustina()));

        jLabel3.setText("g/cm3");

        jLabel4.setText("Gustina kuglice =");

        lblGustinaK.setText(String.valueOf(Kuglica.getGustinaKuglice()));

        jLabel5.setText("g/cm3");

        jLabel6.setText("Prečnik kuglice =");

        jLabel7.setText("mm");

        lblPrecnik.setText(String.valueOf(Kuglica.getPrecnikKuglice()));

        jRadioButton1.setText("Jedno merenje");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Više merenja");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        lblPPutTxt.setText("Pređeni put:");
        lblPPutTxt.setVisible(false);

        jTextField1.setText("000");
        jTextField1.setVisible(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel9.setText("mm");
        jLabel9.setVisible(false);

        lblVremeTxt.setText("Vreme:");
        lblVremeTxt.setVisible(false);

        stoperica.setText("START/STOP");
        stoperica.setVisible(false);

       //Kreiranje dva Action listener-a i naizmenicno dodeljivanje dugmetu stoperice
        ActionListener a1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae1) {

                start = Vreme.vremeStart();
                off = false;
                n++;
            }
        };
        ActionListener a2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae2) {

                interval = Vreme.izmeriVreme(start);
                izmerenoVreme = (double) interval;
                System.out.println(izmerenoVreme);
                if(n%2==0)vreme.setText(String.valueOf(izmerenoVreme / 1000));
                off = true;
            }
        };

        stoperica.addActionListener(a1);
        if (off == false) {
            stoperica.addActionListener(a2);
        }
       

        potvrdi.setText("Potvrdi");
        potvrdi.setVisible(false);
        potvrdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potvrdiActionPerformed(evt);
            }
        });

        vreme.setText("00.000");
        vreme.setVisible(false);

        jLabel11.setText("s");
        jLabel11.setVisible(false);

        jButton1.setText("Odustani");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        greska.setForeground(new java.awt.Color(255, 0, 51));
        greska.setText("Greška");
        greska.setVisible(false);

        izracunaj.setText("Izračunaj");
        izracunaj.setMaximumSize(new java.awt.Dimension(155, 31));
        izracunaj.setMinimumSize(new java.awt.Dimension(155, 31));
        izracunaj.setPreferredSize(new java.awt.Dimension(155, 31));
        izracunaj.setVisible(false);
        izracunaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izracunajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lblPPutTxt)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel9))
                                                .addComponent(jRadioButton1)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblGustinaK)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel5))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblGustinaT)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel3))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblPrecnik)
                                                        .addGap(5, 5, 5)
                                                        .addComponent(jLabel7))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(jRadioButton2)
                                                                .addGap(120, 120, 120)
                                                                .addComponent(izracunaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(lblVremeTxt)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(stoperica)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(vreme)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel11)
                                                                .addGap(51, 51, 51)
                                                                .addComponent(potvrdi))))
                                        .addGap(0, 0, Short.MAX_VALUE)))
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
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(lblGustinaT)
                                .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(lblGustinaK)
                                .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(lblPrecnik))
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton2)
                                .addComponent(izracunaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPPutTxt)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblVremeTxt)
                                .addComponent(stoperica)
                                .addComponent(potvrdi)
                                .addComponent(vreme)
                                .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(greska)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton2))
                        .addGap(26, 26, 26))
        );

        pack();

    }

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        jRadioButton2.setEnabled(false);
        lblPPutTxt.setVisible(true);
        jTextField1.setVisible(true);
        jLabel9.setVisible(true);
        lblVremeTxt.setVisible(true);
        stoperica.setVisible(true);
        vreme.setVisible(true);
        jLabel11.setVisible(true);
        potvrdi.setVisible(true);
        
        Rezultat.setBrojMerenja(1);

    }

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        jRadioButton1.setEnabled(false);
        izracunaj.setVisible(true);
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

        String predjeniPut = jTextField1.getText();
        Pattern p = Pattern.compile("^[0-9]{2,3}$");
        Matcher m = p.matcher(predjeniPut);
        if (m.find()) {
            try {
                this.pPut = Integer.parseInt(predjeniPut);
                Kuglica.setPut_kuglice(this.pPut);
                greska.setVisible(false);
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                greska.setText("*** Podatak nije prihvaćen ***");
                greska.setVisible(true);
            }

        } else {
            jTextField1.setText("??");
            greska.setText("*** Uneli ste podatak u pogrešnom formatu ***");
            greska.setVisible(true);
        }
        System.out.println(pPut);
    }

    private void potvrdiActionPerformed(java.awt.event.ActionEvent evt) {

        double koefViskoznosti = Operacije.izracunajKoefViskoznosti(Kuglica.getPrecnikKuglice() / 2, Kuglica.getPut_kuglice(), Kuglica.getGustinaKuglice(), Tecnost.getGustina(), izmerenoVreme);
        System.out.println(koefViskoznosti);
        Rezultat.setEta(koefViskoznosti);
        Rezultat.setBrojMerenja(1);

        double greskaJM = Operacije.greskaJednogMerenja(Rezultat.getEta(), Kuglica.getPrecnikKuglice() / 2, Kuglica.getGreskaKuglice(), Kuglica.getGustinaKuglice(), izmerenoVreme);
        System.out.println("Greska=" + greskaJM);
        System.out.println("r: " + Kuglica.getPrecnikKuglice() / 2);
        System.out.println("greskaKuglice: " + Kuglica.getGreskaKuglice());
        System.out.println("gustina kuglice: " + Kuglica.getGustinaKuglice());
        System.out.println("Vreme: " + izmerenoVreme);
        Rezultat.setGreska(greskaJM);
        dispose();
        RezultatProzor rezpr = new RezultatProzor();
        rezpr.setLocation(dim.width/2-rezpr.getSize().width/2, dim.height/2-rezpr.getSize().height/2);
        rezpr.setVisible(true);

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        PotvrdaIzlaska izlaz = new PotvrdaIzlaska();
        izlaz.setLocation(dim.width/2-izlaz.getSize().width/2, dim.height/2-izlaz.getSize().height/2);
        izlaz.setVisible(true);

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        MaterijalKuglice mat = new MaterijalKuglice();
        mat.setLocation(dim.width/2-mat.getSize().width/2, dim.height/2-mat.getSize().height/2);
        mat.setVisible(true);
    }

    private void izracunajActionPerformed(java.awt.event.ActionEvent evt) {

        dispose();
        ViseMerenja vmr = new ViseMerenja();
        vmr.setLocation(dim.width/2-vmr.getSize().width/2, dim.height/2-vmr.getSize().height/2);
        vmr.setVisible(true);

    }

}
