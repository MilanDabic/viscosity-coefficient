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
import koeficijent_viskoznosti.model.Vreme;
import koeficijent_viskoznosti.model.Kuglica;
import koeficijent_viskoznosti.model.Tecnost;
import koeficijent_viskoznosti.model.Suma;
import koeficijent_viskoznosti.model.Rezultat;
import static java.lang.Math.pow;
import java.util.ArrayList;

/**
 *
 * @author Milan Dabić
 * 
 * Prozor koji se obnavlja zeljeni broj puta i u koji se unose parametri ponavljanih merenja
 * Ovde se takodje svi rezultati sumiraju i dele sa brojem ponavljanja i racuna greska
 */
public class ViseMerenja extends javax.swing.JFrame {

    private javax.swing.JLabel greska;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton stoperica;
    private javax.swing.JLabel lblPPutTxt;
    private javax.swing.JLabel lblVremeTxt;
    private javax.swing.JButton novoMerenje;
    private javax.swing.JButton potvrdi;
    private javax.swing.JLabel vreme;
    private int pPut;
    private long start;
    private long interval;
    double izmerenoVreme;
    double sumaGr = 0;
    boolean off;
    int n=1;
    ArrayList<Double> merenja = new ArrayList<>();
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    public ViseMerenja() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblPPutTxt = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblVremeTxt = new javax.swing.JLabel();
        stoperica = new javax.swing.JButton();
        vreme = new javax.swing.JLabel();
        potvrdi = new javax.swing.JButton();
        greska = new javax.swing.JLabel();
        novoMerenje = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Merenje");

        lblPPutTxt.setText("Pređeni put");

        jTextField1.setText("000");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("mm");

        lblVremeTxt.setText("Vreme:");

        stoperica.setText("START/STOP");

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

        vreme.setText("00.000");

        potvrdi.setText("Potvrdi");
        potvrdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potvrdiActionPerformed(evt);
            }
        });

        greska.setForeground(new java.awt.Color(255, 0, 51));
        greska.setText("Greska");
        greska.setVisible(false);

        novoMerenje.setText("Novo merenje");
        novoMerenje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoMerenjeActionPerformed(evt);
            }
        });

        jButton1.setText("Kraj");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(lblPPutTxt)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jLabel2))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(lblVremeTxt)
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(greska)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(stoperica)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(vreme)
                                                                                        .addGap(51, 51, 51)
                                                                                        .addComponent(potvrdi)))))
                                                        .addGap(0, 171, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(novoMerenje)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton1)
                                                        .addGap(51, 51, 51)))))
                        .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPPutTxt)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblVremeTxt)
                                .addComponent(stoperica)
                                .addComponent(vreme)
                                .addComponent(potvrdi))
                        .addGap(43, 43, 43)
                        .addComponent(greska)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(novoMerenje)
                                .addComponent(jButton1))
                        .addGap(37, 37, 37))
        );

        pack();
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
        double r = Kuglica.getPrecnikKuglice() / 2;
        double koefViskoznosti = Operacije.izracunajKoefViskoznosti(r, Kuglica.getPut_kuglice(), Kuglica.getGustinaKuglice(), Tecnost.getGustina(), izmerenoVreme);
        System.out.println(koefViskoznosti);
        Suma.suma = Suma.suma + koefViskoznosti;
        Suma.brojac = ++Suma.brojac;


        merenja.add(koefViskoznosti);
        System.out.println("Suma: " + Suma.suma + '\n' + "Brojac: " + Suma.brojac);
        potvrdi.setEnabled(false);
        if (Suma.brojac > 1) {
            jButton1.setEnabled(true);
        }
    }

    private void novoMerenjeActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        ViseMerenja vmer = new ViseMerenja();
        vmer.setLocation(dim.width / 2 - vmer.getSize().width / 2, dim.height / 2 - vmer.getSize().height / 2);
        vmer.setTitle("Merenje " + Integer.toString(Suma.brojac + 1));
        vmer.setVisible(true);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        Rezultat.setEta(Suma.suma / Suma.brojac);
        Rezultat.setBrojMerenja(Suma.brojac);

        for (int i = 0; i < merenja.size(); i++) {
            sumaGr = sumaGr + pow((merenja.get(i) - Rezultat.getEta()), 2);

        }
        System.out.println("sumaGr=" + sumaGr);
        double greskaVM = Operacije.greskaViseMerenja((double) Suma.brojac, sumaGr);
        System.out.println("Greska=" + greskaVM);
        Rezultat.setGreska(greskaVM);
        System.out.println("Eta=" + Rezultat.getEta());
        System.out.println("Greska=" + Rezultat.getGreska());
        dispose();
        RezultatProzor rezpr = new RezultatProzor();
        rezpr.setLocation(dim.width / 2 - rezpr.getSize().width / 2, dim.height / 2 - rezpr.getSize().height / 2);
        rezpr.setVisible(true);

    }

}
