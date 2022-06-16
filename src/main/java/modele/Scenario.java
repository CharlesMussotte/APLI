package modele;

import java.util.ArrayList;
import java.util.List;

public class Scenario {
    List<String> vendeurs ;
    List <String> acheteurs ;
    public Scenario () {
        vendeurs = new ArrayList<>();
        acheteurs = new ArrayList<>();
    }
    public void ajoutVendeurAcheteur(String vendeur, String acheteur) {
        vendeurs.add(vendeur);
        acheteurs.add(acheteur);
    }
    public List<String> getVendeurs() {
        return vendeurs ;
    }
    public List<String> getAcheteurs() {
        return acheteurs ;
    }
    public String toString() {
        return vendeurs + "\n" + acheteurs ;
    }
}
