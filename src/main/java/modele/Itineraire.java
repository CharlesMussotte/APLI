package modele;

public class Itineraire {
    private Ville[] listVille;

    //----- CONSTRUCTEURS -----

    public Itineraire(Ville[] parListVille){
        listVille=parListVille;
    }

    public Itineraire(int parNombreLigne){
        ArrayList<Ville> sources = new ArrayList<Ville>();
        TreeMap treeSuccesseurs = new TreeMap();
        TreeMap treeNBPredesseurs = new TreeMap();
        ArrayList<Ville> listeVilleItineraire = new ArrayList<Ville>();

        while(sources.length() != 0){
            Ville actuel = sources.get(1);
            ArrayList successeursDeActuel = treeSuccesseurs.getKey(actuel);
            while (successeursDeActuel != 0){
                treeNBPredesseurs.getKey(successeursDeActuel.getKey(1)) - 1;
                if (treeNBPredesseurs.getKey(successeursDeActuel.getKey(1)) == 0){sources.put(treeNBPredesseurs.getKey(successeursDeActuel.getKey(1)))}
            sources.remove(sources.get(1));
            listeVilleItineraire.add(actuel);
            }
        listVille= listeVilleItineraire;
        }


        while (file.length != 0){
            file.remove(1);
            for (int i=0;)
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
