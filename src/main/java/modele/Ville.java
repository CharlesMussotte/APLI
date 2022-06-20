package modele;

import java.io.File;
import java.io.IOException;

public class Ville {
    private String nomVille;
    private int[][] distance;

    //----- CONSTRUCTEURS -----

    Ville(String parVille){
        nomVille=parVille;
        distance= new int[][]{};
    }




    //----- ACCESSEURS -----

    public String getNomVille(){
        return nomVille;
    }

    public int[][] getDistanceVille(){
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
