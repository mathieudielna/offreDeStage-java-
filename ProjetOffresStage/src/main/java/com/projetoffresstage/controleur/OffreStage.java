/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetoffresstage.controleur;

/**
 *
 * @author mathieudielna
 */
public class OffreStage extends Entreprise {
    private String libelléOffre;
    private String descriptifOffre;
    private String domaineOffre;
    private String dateDébutOffre;
    private String duréeOffre;
    //private String cheminOffre; Not used in program
    //private boolean valide; Not used in program
    
    public OffreStage(String rS, String aVE, String aRE, String aCPE, String mE, String tE, String sA,String a, String b, String c, String d, String e){
        super(rS, aVE, aRE, aCPE, mE, tE, sA);
        this.libelléOffre = a;
        this.descriptifOffre = b;
        this.domaineOffre = c;
        this.dateDébutOffre = d;
        this.duréeOffre = e;
        //this.cheminOffre = f;not used
        //this.valide = g; not used
    }
    
    //GET
    public String get_libelléOffre(){
        return this.libelléOffre;
    }
    
    public String get_descriptifOffre(){
        return this.descriptifOffre;
    }
    
    public String get_domaineOffre(){
        return this.domaineOffre;
    }
    
    public String get_dateDébutOffre(){
        return this.dateDébutOffre;
    }
    
    public String get_duréeOffre(){
        return this.duréeOffre;
    }
    
    /*
    public String get_cheminOffre(){
        return this.cheminOffre;
    }
    
    public boolean get_valide(){
        return this.valide;
    }
    */
    
    //SET
        public void set_libelléOffre(String e){
        this.libelléOffre = e;
    }
    
    public void set_descriptifOffre(String e){
        this.descriptifOffre = e;
    }
    
    public void set_domaineOffre(String e){
        this.domaineOffre = e;
    }
    
    public void set_dateDébutOffre(String e){
        this.dateDébutOffre = e;
    }
    
    public void set_duréeOffre(String e){
        this.duréeOffre = e;
    }
    
    /*
    public void set_cheminOffre(String e){
        this.cheminOffre = e ;
    }
    
    public void set_valide(boolean e){
        this.valide = e;
    }
    */
    
    //ToString
    @Override
    public String toString(){
        return  super.toString() +"\n --OFFRE DE STAGE--" +
                "\n Libellé Offre >>" +libelléOffre +
                "\n Descriptif Offre >>" + descriptifOffre +
                "\n Domaine Offre >>" + domaineOffre +
                "\n Date Début Offre >>" + dateDébutOffre +
                "\n Durée Offre >>" + duréeOffre +" " +"Jours.";
    }
}
