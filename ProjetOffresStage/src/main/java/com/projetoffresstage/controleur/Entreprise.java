/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetoffresstage.controleur;
 
import java.io.Serializable;

/**
 *
 * @author mathieudielna
 */
public class Entreprise implements Serializable {
    private String raisonSociale;
    private String adresseVilleEntreprise;
    private String adresseRueEntreprise;
    private String adresseCodePostalEntreprise;
    private String mailEntreprise;
    private String telEntreprise;
    private String secteurActivité;
    
    public Entreprise(String rS, String aVE, String aRE, String aCPE, String mE, String tE, String sA){
        this.raisonSociale = rS;
        this.adresseVilleEntreprise = aVE;
        this.adresseRueEntreprise = aRE;
        this.adresseCodePostalEntreprise = aCPE;
        this.mailEntreprise = mE;
        this.telEntreprise = tE;
        this.secteurActivité = sA;
    }
    
    //GET
    public String get_raisonSociale(){
        return this.raisonSociale;
    }
    
    public String get_adresseVilleEntreprise(){
        return this.adresseVilleEntreprise;
    }
    
    public String get_adresseRueEntreprise(){
        return this.adresseRueEntreprise;
    }
    
    public String get_adresseCodePostalEntreprise(){
        return this.adresseCodePostalEntreprise;
    }
    
    public String get_mailEntreprise(){
        return this.mailEntreprise;
    }
    
    public String get_telEntreprise(){
        return this.telEntreprise;
    }
    
    public String get_secteurActivite(){
        return this.secteurActivité;
    }
    
    //SET
    public void set_raisonSociale(String e){
        this.raisonSociale = e;
    }
    
    public void set_adresseVilleEntreprise(String e){
        this.adresseVilleEntreprise = e;
    }
    
    public void set_adresseRueEntreprise(String e){
        this.adresseRueEntreprise = e;
    }
    
    public void set_adresseCodePostalEntreprise(String e){
        this.adresseCodePostalEntreprise = e;
    }
    
    public void set_mailEntreprise(String e){
        this.mailEntreprise = e;
    }
    
    public void set_telEntreprise(String e){
        this.telEntreprise = e;
    }
    
    public void set_secteurActivite(String e){
        this.secteurActivité = e;
    }
    
    //toString
    @Override
    public String toString(){
        return  "\n"+"--ENTREPRISE--" +
                "\n Raison Sociale >>" + raisonSociale + 
                "\n Adresse Ville Entreprise >>" + adresseVilleEntreprise +
                "\n Adresse Rue Entreprise >>" + adresseRueEntreprise +
                "\n Adresse Code Postal Entreprise >>" + adresseCodePostalEntreprise +
                "\n Mail Entreprise >>"+ mailEntreprise +
                "\n Tel Entreprise >>" + telEntreprise +
                "\n Secteur Activité >>" + secteurActivité;
    }
}
