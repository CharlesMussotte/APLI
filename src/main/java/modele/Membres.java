package modele;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Membres {
    List<String> noms ;
    List <String> villes ;


    //----- CONSTRUCTEURS -----

    public Membres() throws IOException {
        Membres listMembres = Lecture.lectureMembres(new File("C:\\Users\\theob\\IdeaProjects\\APLI\\TourAPLI\\membres_APLI.txt"));
        noms = listMembres.getNomMembre();
        villes= listMembres.getVilleMembre();
    }

    public void ajoutMembre(String nom, String ville) {
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
