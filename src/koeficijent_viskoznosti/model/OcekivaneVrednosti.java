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
 * Referentne vrednosti koeficijenta viskosti za poredjenje sa izracunatim
 */
public class OcekivaneVrednosti {
    
    private final static double GLICERIN=1.412;
    private final static double ALKOHOL=0.001144;
    private final static double VODA=0.001;
    private final static double ULJE=0.28723;

    public static double getGLICERIN() {
        return GLICERIN;
    }

    public static double getALKOHOL() {
        return ALKOHOL;
    }

    public static double getVODA() {
        return VODA;
    }

    public static double getULJE() {
        return ULJE;
    }
    
    
    
}
