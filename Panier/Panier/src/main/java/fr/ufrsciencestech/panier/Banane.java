package fr.ufrsciencestech.panier;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Banane
{

    private double prix;
    private String origine;

    public Banane(double p, String o) throws Exception	
        {	
		this.prix=p;
		this.origine=o;
                if(prix<0)
                    throw new Exception("prix invalide");
	}
        
    public double getPrix()
	{
		return this.prix;
	}

    public String getOrigine()
	{
		return this.origine;
	}

    public void setPrix(double prix) throws Exception {
        if(prix<0)
           throw new Exception("prix invalide");
        this.prix = prix;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    @Override
    public String toString() {
        return "Banane{" + "prix=" + prix + "$, origine=" + origine + '}';
    }

}
