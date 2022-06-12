package modele;

public class Itineraire {
    private Ville[] listVille;

    public Itineraire(Ville[] parListVille){
        listVille=parListVille;
    }
    public void ajoutVille(){

    }
    public void supprimeVille(){

    }

    public Ville[] getListVille() {
        return listVille;
    }
    public String toString(){
        return listVille.toString();
    }
}
