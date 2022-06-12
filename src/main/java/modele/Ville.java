package modele;

public class Ville implements CONSTANTE_VILLE {
    private String nomVille;
    private int[] distance;
    Ville(String parVille){
        nomVille=parVille;
        distance=DISTANCE;
    }
    public String getNomVille(){return nomVille;}
    public int[] getDistance(){return distance;}
    public String toString(){return nomVille;}
}
