package modele;

public class Ville implements CONSTANTE_VILLE {
    private String nomVille;
    private int[] distance;

    //----- CONSTRUCTEURS -----

    Ville(String parVille){
        nomVille=parVille;
        distance=DISTANCE;
    }

    public Ville() throws IOException {
        Ville listVille = Lecture.lectureVilleDistance(new File("C:\\Users\\theob\\IdeaProjects\\APLI\\TourAPLI\\distances.txt"));
        nomVille = listVille.getNomVille();
        villes= listVille.getDistance();
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
