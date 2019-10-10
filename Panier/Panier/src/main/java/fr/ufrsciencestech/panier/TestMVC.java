package fr.ufrsciencestech.panier;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author af433882
 */
public class TestMVC {
    

    
    public static void main(String args[]) throws Exception
    {
        VueGAWT fenetre;
        Panier p = new Panier(10);
	p.ajoute(new Orange(9.99,"france"));
        fenetre = new VueGAWT();
        p.addObserver(fenetre);
        fenetre.ajoutControlleur(new Controlleur(p));
    }    
	
}
