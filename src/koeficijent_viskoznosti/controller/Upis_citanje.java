/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koeficijent_viskoznosti.controller;

import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import koeficijent_viskoznosti.model.Upis;
import org.codehaus.jackson.map.ObjectMapper;




/**
 *
 * @author Milan Dabić
 */
public class Upis_citanje {
    
    //upis u json kada fajl ne postoji
    public static void upisiUJson(List<Upis> rezultati) throws IOException{
        String upis=new Gson().toJson(rezultati);
        FileWriter fwr=new FileWriter("koeficijent_viskoznosti.json");
        fwr.write(upis);
        fwr.close();
        
    }
    
    //Ako već postoji json fajl, potrebno je prvo sve objekte učitati u Array listu, dodati 
    //nov objekat u listu i onda je ponovo upisati u json fajl, koji će "pregaziti" stari
    public static void upisiUPostojeciJson(Upis upis) throws IOException{
        Gson gson=new Gson();
        
        List<Upis> rezultati=new ArrayList<>();
        ObjectMapper mapper=new ObjectMapper();
        try{
        rezultati=mapper.readValue(new FileReader("koeficijent_viskoznosti.json"), mapper.getTypeFactory().constructCollectionType(List.class, Upis.class));
        }catch(java.io.FileNotFoundException e){
        e.printStackTrace();
        
        }
        rezultati.add(upis);
        String json = gson.toJson(rezultati);
        FileWriter flw=new FileWriter("koeficijent_viskoznosti.json");
        flw.write(json);
        flw.close();
    }
    
    //kreiranje liste objekata iz json fajla
    public static List<Upis> citajJson() throws FileNotFoundException, IOException{
        List<Upis> rezultati=new ArrayList<>();
        ObjectMapper mapper=new ObjectMapper();
        rezultati=mapper.readValue(new FileReader("koeficijent_viskoznosti.json"), mapper.getTypeFactory().constructCollectionType(List.class, Upis.class));
        return rezultati;
        
    }

    
    
    
    
}
