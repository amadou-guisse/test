/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetmaven;

/**
 *
 * @author guisse
 */
public class Etudiant  extends Personne{
    
    private String niveuEtude;

    public Etudiant(String niveuEtude) {
        this.niveuEtude = niveuEtude;
    }

    public String getNiveuEtude() {
        return niveuEtude;
    }

    public void setNiveuEtude(String niveuEtude) {
        this.niveuEtude = niveuEtude;
    }
    
}
