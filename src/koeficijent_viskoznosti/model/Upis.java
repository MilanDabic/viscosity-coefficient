/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koeficijent_viskoznosti.model;

import java.io.Serializable;

/**
 *
 * @author Milan Dabić
 * 
 * Podaci koji ce se upisivati u json
 */
public class Upis implements Serializable{
    
    private int brojMerenja;
    private String vrstaTecnosti;
    private  double eta;
    private  double greska;

    public Upis() {
    }

    public Upis(int brojMerenja, String vrstaTecnosti, double eta, double greska) {
        this.brojMerenja = brojMerenja;
        this.vrstaTecnosti = vrstaTecnosti;
        this.eta = eta;
        this.greska = greska;
    }

    public int getBrojMerenja() {
        return brojMerenja;
    }

    public void setBrojMerenja(int brojMerenja) {
        this.brojMerenja = brojMerenja;
    }

    public String getVrstaTecnosti() {
        return vrstaTecnosti;
    }

    public void setVrstaTecnosti(String vrstaTecnosti) {
        this.vrstaTecnosti = vrstaTecnosti;
    }

    public double getEta() {
        return eta;
    }

    public void setEta(double eta) {
        this.eta = eta;
    }

    public double getGreska() {
        return greska;
    }

    public void setGreska(double greska) {
        this.greska = greska;
    }

    @Override
    public String toString() {
        return "Upis{" + "brojMerenja=" + brojMerenja + ", vrstaTecnosti=" + vrstaTecnosti + ", eta=" + eta + ", greska=" + greska + '}';
    }

   

    
    
    
}
