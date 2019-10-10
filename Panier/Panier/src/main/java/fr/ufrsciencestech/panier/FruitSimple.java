/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author eb143296
 */
public abstract class FruitSimple {
    protected double prix;
    protected String origine;
    
    protected double getPrix(){
        return this.prix;
    }
    protected String getOrigine()
    {
        return this.origine;
    }
    
    protected void setPrix(double prix) {
        this.prix = prix;
    }

    protected void setOrigine(String origine) {
        this.origine = origine;
    }
}
