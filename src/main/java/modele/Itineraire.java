package modele;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Itineraire {
    private List listVille;

    //----- CONSTRUCTEURS -----

    public Itineraire(List parListVille){
        listVille=parListVille;
    }

    public void Itineraire(File fichier, Scenario scenario) throws IOException {
        Membres membres = new Membres();
        ArrayList<String> noms= (ArrayList<String>) membres.getNomMembre();
        ArrayList<String> villes= (ArrayList<String>) membres.getVilleMembre();
        ArrayList<String> sources = new ArrayList<>();
        TreeMap treeSuccesseurs = new TreeMap();
        TreeMap treeNBPredesseurs = new TreeMap();
        ArrayList<String> listeVilleItineraire = new ArrayList<>();
        ArrayList<String> vendres = (ArrayList<String>) scenario.getVendeurs();
        ArrayList<String> acheteurs = (ArrayList<String>) scenario.getAcheteurs();
        ArrayList<int> villeVendres = new ArrayList();
        ArrayList<int> villeAcheteurs = new ArrayList();
        for (String vendeur : vendres){
            int nb =0;
            while (vendeur != noms.get(nb)){
                nb++;
            }
            villeVendres.add(nb);
        }
        for (String acheteur : acheteurs){
            int nb =0;
            while (acheteur != noms.get(nb)){
                nb++;
            }
            villeAcheteurs.add(nb);
        }


    }


    //----- METHODES -----

    public void ajoutVille(){

    }
    public void supprimeVille(){

    }




    //----- ACCESSEURS -----

    public List getListVille() {
        return listVille;
    }


    //----- TO STRING -----

    public String toString(){
        return listVille.toString();
    }
}
