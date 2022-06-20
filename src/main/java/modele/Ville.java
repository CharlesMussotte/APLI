package modele;

import java.io.File;
import java.io.IOException;

public class Ville implements CONSTANTE_VILLE {
    private final String nomVille;
    private int[] distance;

    //----- CONSTRUCTEURS -----

    Ville(String parVille){
        nomVille=parVille;
        distance=DISTANCE;
    }

    public Ville() throws IOException {
        Ville listVille = Lecture.lectureVilleDistance(new File("C:\\Users\\theob\\IdeaProjects\\APLI\\TourAPLI\\distances.txt"));
        nomVille = listVille.getNomVille();
    }


    //----- ACCESSEURS -----

    public String getNomVille(){
        return nomVille;
    }

    public int[] getDistanceVille(){
        return distance;
    }


    //----- TO STRING -----
    
    public String toString(){
        return nomVille;
    }

    public void ajoutVille(String nextToken) {
    }


    public void ajoutDistanceVille(int i, Integer valueOf) {
    }
}
