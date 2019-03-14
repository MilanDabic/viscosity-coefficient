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
public class Kuglica {
    private static double gustinaKuglice, precnikKuglice, masaKuglice, greskaKuglice;
    private static int put_kuglice;
    private static String materijal_kuglice;
    public final static double GUSTINA_FE=7.87;
    public final static double GUSTINA_CU=8.96;
    public final static double GUSTINA_AL=2.70;
    public final static double GUSTINA_AU=19.32;
    public final static double GUSTINA_PB=11.34;
    public final static double GUSTINA_SN=7.26;
    public final static double GUSTINA_AG=10.49;
    



    public Kuglica() {
    }

    public static double getGustinaKuglice() {
        return gustinaKuglice;
    }

    public static void setGustinaKuglice(double gustinaKuglice) {
        Kuglica.gustinaKuglice = gustinaKuglice;
    }

    public static double getPrecnikKuglice() {
        return precnikKuglice;
    }

    public static void setPrecnikKuglice(double precnikKuglice) {
        Kuglica.precnikKuglice = precnikKuglice;
    }

    public static double getMasaKuglice() {
        return masaKuglice;
    }

    public static void setMasaKuglice(double masaKuglice) {
        Kuglica.masaKuglice = masaKuglice;
    }

    public static int getPut_kuglice() {
        return put_kuglice;
    }

    public static void setPut_kuglice(int put_kuglice) {
        Kuglica.put_kuglice = put_kuglice;
    }

    public static String getMaterijal_kuglice() {
        return materijal_kuglice;
    }

    public static void setMaterijal_kuglice(String materijal_kuglice) {
        Kuglica.materijal_kuglice = materijal_kuglice;
    }

    public static double getGreskaKuglice() {
        return greskaKuglice;
    }

    public static void setGreskaKuglice(double greskaKuglice) {
        Kuglica.greskaKuglice = greskaKuglice;
    }

    
    

    
    
    

    
}