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
 * Metode za racunanje vremenskog intervala
 */
public class Vreme {
    private static long start;
    public static long vremeStart(){
        start=System.currentTimeMillis();
        return start;
    }
    
    public static long izmeriVreme(long start){
        
        long stop=System.currentTimeMillis();
        long vreme=stop-start;
        return vreme;
    }
    
}
