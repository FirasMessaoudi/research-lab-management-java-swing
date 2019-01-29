/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava2;

/**
 *
 * @author Scofield
 */
public class Labo {
    private String code,acro,nom,adresse,universite,domaine;
    private byte[]logo;

    public Labo(String code, String acro, String nom, String adresse, String universite, String domaine, byte[] logo) {
        this.code = code;
        this.acro = acro;
        this.nom = nom;
        this.adresse = adresse;
        this.universite = universite;
        this.domaine = domaine;
        this.logo = logo;
    }

    public String getCode() {
        return code;
    }

    public String getAcro() {
        return acro;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getUniversite() {
        return universite;
    }

    public String getDomaine() {
        return domaine;
    }

    public byte[] getLogo() {
        return logo;
    }
    
    
}
