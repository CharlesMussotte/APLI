package modele;

public class Itineraire {
    private Ville[] listVille;

    //----- CONSTRUCTEURS -----

    public Itineraire(Ville[] parListVille){
        listVille=parListVille;
    }


    //----- METHODES -----

    public void ajoutVille(){

    }
    public void supprimeVille(){

    }


    //----- ACCESSEURS -----

    public Ville[] getListVille() {
        return listVille;
    }


    //----- TO STRING -----
    
    public String toString(){
        return listVille.toString();
    }
}
