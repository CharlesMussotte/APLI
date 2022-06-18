package modele;

public class Ville implements CONSTANTE_VILLE {
    private String nomVille;
    private int[] distance;

    //----- CONSTRUCTEURS -----

    Ville(String parVille){
        nomVille=parVille;
        distance=DISTANCE;
    }


    //----- ACCESSEURS -----

    public String getNomVille(){
        return nomVille;
    }

    public int[] getDistance(){
        return distance;
    }


    //----- TO STRING -----
    
    public String toString(){
        return nomVille;
    }
}
