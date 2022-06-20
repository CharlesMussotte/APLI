package modele;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Itineraire {
    private List listVille;

    //----- CONSTRUCTEURS -----

    public Itineraire(List parListVille){
        listVille=parListVille;
    }

    public Itineraire(Scenario scenario) throws IOException {
        Membres membres = Lecture.lectureMembres(new File("TourAPLI\\membres_APLI.txt"));;
        ArrayList<String> noms= (ArrayList<String>) membres.getNomMembre();
        ArrayList<String> villes= (ArrayList<String>) membres.getVilleMembre();
        ArrayList<String> sources = new ArrayList<>();
        TreeMap<String,ArrayList> treeSuccesseurs = new TreeMap();
        TreeMap<String, Integer> treeNBPredesseurs = new TreeMap<>();
        ArrayList<String> listeVilleItineraire = new ArrayList<>();
        ArrayList<String> vendres = (ArrayList<String>) scenario.getVendeurs();
        ArrayList<String> acheteurs = (ArrayList<String>) scenario.getAcheteurs();
        ArrayList<String> villeVendres = new ArrayList();
        ArrayList<String> villeAcheteurs = new ArrayList();


        for (String vendeur : vendres){
            int nb =0;
            while (!vendeur.equals(noms.get(nb))){
                nb++;
            }
            villeVendres.add(villes.get(nb));
        }
        for (String acheteur : acheteurs){
            int nb =0;
            while (!acheteur.equals(noms.get(nb))){
                nb++;
            }
            villeAcheteurs.add(villes.get(nb));
        }
        for (int i=0; i<villeVendres.size();i++){
            if(treeSuccesseurs.containsKey(villeVendres.get(i))){
                treeSuccesseurs.get(villeVendres.get(i)).add(villeAcheteurs.get(i));
                if (treeNBPredesseurs.get(villeAcheteurs.get(i)) == null){
                    treeNBPredesseurs.put(villeAcheteurs.get(i),1);
                }
                else{
                    int ii = treeNBPredesseurs.get(villeAcheteurs.get(i));
                    ii+=1;
                    treeNBPredesseurs.put(villeAcheteurs.get(i),ii);
                }
            }
            else{
                ArrayList<String> arrayListVendeur = new ArrayList<>();
                ArrayList<String> arrayList =new ArrayList<>();

                arrayListVendeur.add(villeAcheteurs.get(i));
                treeSuccesseurs.put(villeVendres.get(i),arrayListVendeur);
                treeNBPredesseurs.put(villeVendres.get(i),1);
                if (treeNBPredesseurs.get(villeAcheteurs.get(i)) == null){
                    treeNBPredesseurs.put(villeAcheteurs.get(i),1);
                    treeSuccesseurs.put(villeAcheteurs.get(i),arrayList);
                }
                else {
                    int ii = treeNBPredesseurs.get(villeAcheteurs.get(i));
                    ii+=1;
                    treeNBPredesseurs.put(villeAcheteurs.get(i),ii);
                }
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for (String str : villeVendres) {
            if (treeNBPredesseurs.get(str)== 1){
                list.add(str);
            }

        }
        treeSuccesseurs.put("Velizy",list);
        treeNBPredesseurs.put("Velizy",0);
        sources.add("Velizy");

        System.out.println(treeSuccesseurs);
        while (sources != null){

            for (String ville : treeNBPredesseurs.keySet()) {

                if (treeSuccesseurs.get(sources.get(0)).contains(ville) && treeNBPredesseurs.get(ville) != 0){
                    Integer i = treeNBPredesseurs.get(ville);
                    i -=1;
                    treeNBPredesseurs.put(ville,i);
                    System.out.println(treeNBPredesseurs);
                }
            }
            listeVilleItineraire.add(sources.get(0));
            sources.remove(0);

            for (String str : treeNBPredesseurs.keySet()) {
                if (treeNBPredesseurs.get(str) == 0 && !listeVilleItineraire.contains(str)){
                    sources.add(str);
                }
            }
        }
        listVille =listeVilleItineraire;
    }


    //----- METHODES -----

    public void ajoutVille(String ville){
        listVille.add(ville);
    }
    public void supprimeVille(String ville){
        listVille.remove(ville);
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
