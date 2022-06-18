package modele;

public class Itineraire {
    private Ville[] listVille;

    //----- CONSTRUCTEURS -----

    public Itineraire(Ville[] parListVille){
        listVille=parListVille;
    }

    public Itineraire(int parNombreLigne){
        ArrayList<Ville> file = new ArrayList<Ville>();
        While (file.length != 0){
            file.remove(1);
            For(int i=0;)
        }

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
