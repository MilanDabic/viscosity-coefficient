/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koeficijent_viskoznosti.model;

/**
 *
 * @author Milan Dabić
 */
public class Rezultat {

    private static int brojMerenja;
    private static double eta;
    private static double greska;

    public Rezultat() {
    }

    public static int getBrojMerenja() {
        return brojMerenja;
    }

    public static void setBrojMerenja(int brojMerenja) {
        Rezultat.brojMerenja = brojMerenja;
    }

    public static double getEta() {
        return eta;
    }

    public static void setEta(double eta) {
        Rezultat.eta = eta;
    }

    public static double getGreska() {
        return greska;
    }

    public static void setGreska(double greska) {
        Rezultat.greska = greska;
    }

}
