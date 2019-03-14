/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koeficijent_viskoznosti.model;

/**
 *
 * @author Milan Dabić
 * 
 * Vrste tecnosti koje se mogu odabrati za vezbu
 */
public class Tecnost {
    
    private static double gustina, ocekivanaVrednostEta;
    private static String naziv_tecnosti;
    
    public final static double GUSTINA_GLICERINA=1.2611;
    public final static double GUSTINA_ALKOHOLA=0.7893;
    public final static double GUSTINA_VODE=0.9982;
    public final static double GUSTINA_ULJA=0.8787;

    public Tecnost() {
    }

    public static double getGustina() {
        return gustina;
    }

    public static void setGustina(double gustina) {
        Tecnost.gustina = gustina;
    }

    public static String getNaziv_tecnosti() {
        return naziv_tecnosti;
    }

    public static void setNaziv_tecnosti(String naziv_tecnosti) {
        Tecnost.naziv_tecnosti = naziv_tecnosti;
    }

    public static double getOcekivanaVrednostEta() {
        return ocekivanaVrednostEta;
    }

    public static void setOcekivanaVrednostEta(double ocekivanaVrednostEta) {
        Tecnost.ocekivanaVrednostEta = ocekivanaVrednostEta;
    }
}
