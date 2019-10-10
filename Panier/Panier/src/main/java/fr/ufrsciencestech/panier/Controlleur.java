package fr.ufrsciencestech.panier;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 *
 * @author af433882
 */
public class Controlleur  implements ActionListener{
    
    private Panier pan;

    public Controlleur(Panier pan) {
        this.pan = pan;
    }

    public Panier getPanier() {
        return pan;
    }

    public void setPanier(Panier pan) {
        this.pan = pan;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(((Component)e.getSource()).getName().equals("Plus")){
            try {
                System.out.println("plus");
                pan.ajoute();
            } catch (Exception ex) {
                System.out.println("le panier est plien");
            }
        }else{
            System.out.println("moins");
            pan.retire();
        }
    }
    
}
