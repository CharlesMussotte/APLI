package modele;

import java.util.ArrayList;
import java.util.List;

public class Scenario {
    List<String> vendeurs ;
    List <String> acheteurs ;


    //----- CONSTRUCTEURS -----

    public Scenario () {
        vendeurs = new ArrayList<>();
        acheteurs = new ArrayList<>();
    }


    //----- METHODES -----

    public void ajoutVendeurAcheteur(String vendeur, String acheteur) {
        vendeurs.add(vendeur);
        acheteurs.add(acheteur);
    }


    //----- ACCESSEURS -----

    public List<String> getVendeurs() {
        return vendeurs ;
    }

    public List<String> getAcheteurs() {
        return acheteurs ;
    }


    //----- TO STRING -----

    public String toString() {
        return vendeurs + "\n" + acheteurs ;
    }

}
