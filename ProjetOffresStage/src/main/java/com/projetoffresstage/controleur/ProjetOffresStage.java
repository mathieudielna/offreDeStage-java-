/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetoffresstage.controleur;

import com.projetoffresstage.vue.Accueil;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author SENPAI BORU
 */
public class ProjetOffresStage {
 
public static ArrayList<Entreprise> entreprises = new ArrayList<Entreprise>();
public static ArrayList<OffreStage> offres = new ArrayList<OffreStage>();


    public static void main(String[] args){
        
        //deserializing firms
        try
        {
            FileInputStream f = new FileInputStream("list_entreprise");
            ObjectInputStream s = new ObjectInputStream(f);
            entreprises = (ArrayList<Entreprise>) s.readObject(); //cet objet peut être une collection
        }
        catch(IOException e) {
            System.out.println("list_entreprise");
        }
        catch(ClassNotFoundException e) {
            System.out.println("Probleme");
        }
        
        //deserializing offers
        try
        {
            FileInputStream d = new FileInputStream("list_offres");
            ObjectInputStream o = new ObjectInputStream(d);
            offres = (ArrayList<OffreStage>) o.readObject(); 
        }
        catch(IOException e) {
            System.out.println("list_offres");
        }
        catch(ClassNotFoundException e) {
            System.out.println("Probleme");
        }

        //OPEN ACCUEIL
        Accueil jfrm2= new Accueil();
        jfrm2.setTitle("Accueil");
        jfrm2.setVisible(true);
    } 
    
}
