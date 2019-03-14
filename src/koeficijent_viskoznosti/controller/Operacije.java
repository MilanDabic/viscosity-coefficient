/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koeficijent_viskoznosti.controller;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;



/**
 *
 * @author Milan Dabić
 */
public class Operacije {

    public static double eta;
    public static double greskaKuglice;
    
    /*racunanje koeficijenta viskoznosti po formuli,unose se poluprecnik, predjeni put kuglice,
    gustina kuglice i tecnosti i proteklo vreme*/
    public static double izracunajKoefViskoznosti(double r, double s, double roK, double roT, double t) {
        eta = 2.18 * (r * r / s) * (roK - roT) * t / 1000;
        return eta;
    }
    
    //racunanje greske gustine kuglice, unose se masa, poluprecnik i gustina
    public static double izracunajGreskuKuglice(double m, double r, double roK) {
        greskaKuglice = roK * (0.01 / m + 0.06 / r);
        return greskaKuglice;
    }

    /*greska u koliko se vrsi samo jedno merenje, unose se koef. viskoznosti, poluprecnik, greska i gustina kuglice 
    i proteklo vreme*/
    public static double greskaJednogMerenja(double eta, double r, double greskaKuglice, double roK, double t) {
        double greska = eta * (0.04 / r + greskaKuglice / roK + 0.001 / t);
        return greska;

    }

    /*greska kada se vezba izvodi vise puta, unosi se br. ponavljanja i suma kvadrata razlike pojedinacnih 
    koef. viskoznosti i njihove srednje vrednosti*/
    public static double greskaViseMerenja(double brojPonavljanja, double suma) {
        double n=(1 / (brojPonavljanja - 1)) * suma;
        double greska = sqrt(n);
        return greska;
    }
    
    //racunanje gustine po f-li m/v, gde se v racuna po matematickoj f-li zapremine lopte
    public static double izracunajNepoznatuGustinuKuglice(double precnik, double m){
        
        double gustinaKuglice=m/(4*pow((precnik/2), 3)*Math.PI/3)*1000;
        return gustinaKuglice;
    }
    
  


}
