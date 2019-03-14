/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koeficijent_viskoznosti;

import java.awt.Dimension;
import java.awt.Toolkit;

import koeficijent_viskoznosti.view.WelcomeProzor;



/**
 *
 * @author Milan Dabić
 */
public class Koeficijent_viskoznosti {

  
    public static void main(String[] args) {
        WelcomeProzor pr=new WelcomeProzor();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        pr.setLocation(dim.width/2-pr.getSize().width/2, dim.height/2-pr.getSize().height/2);
        pr.setVisible(true);
        

           
        }
        
            
    }
    

