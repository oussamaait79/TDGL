package fr.ufrsciencestech.panier;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Orange extends FruitSimple
{
    public Orange(double p, String o) throws Exception	
        {	
		this.prix=p;
		this.origine=o;
                if(prix<0)
                    throw new Exception("prix invalide");
	}
        
    @Override
    public String toString() {
        return "Orange{" + "prix=" + prix + "$, origine=" + origine + '}';
    }

}
