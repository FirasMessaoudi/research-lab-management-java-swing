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
public class Chercheur {
    private String cin,nom,pren,age,email,tel;

    public Chercheur(String cin, String nom, String pren, String age, String email, String tel) {
        this.cin = cin;
        this.nom = nom;
        this.pren = pren;
        this.age = age;
        
        this.email = email;
        this.tel = tel;
        
    }

    public String getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPren() {
        return pren;
    }

    public String getAge() {
        return age;
    }

   

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

   

    
    
    
}

