package modele;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Membres {
    static List<String> noms ;
    static List <String> villes ;


    //----- CONSTRUCTEURS -----

    public Membres() {
        noms = new ArrayList<>();
        villes= new ArrayList<>();
    }

    public static void ajoutMembre(String nom, String ville) {
        noms.add(nom);
        villes.add(ville);
    }


    //----- ACCESSEURS -----

    public List<String> getNomMembre() {
        return noms;
    }

    public List<String> getVilleMembre() {
        return villes;
    }

    //----- TO STRING -----
    
    public String toString(){
        return noms +"/n"+villes;
        }

}
