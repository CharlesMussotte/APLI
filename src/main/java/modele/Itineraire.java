//----- IMPORTS -----

package modele;

import java.io.File;
import java.io.IOException;
import java.util.*;


//----- ITINERAIRE -----

public class Itineraire {
    private List listVille;


    //----- CONSTRUCTEURS -----

    public Itineraire(List parListVille){ // Constructeur manuel
        listVille=parListVille;
    }

    public Itineraire(Scenario scenario) throws IOException { // Constructeur à partir d'un scénario

        Membres membres = Lecture.lectureMembres(new File("TourAPLI\\membres_APLI.txt"));

        ArrayList<String> noms= (ArrayList<String>) membres.getNomMembre();
        ArrayList<String> villes= (ArrayList<String>) membres.getVilleMembre(); // Listes membres et villes

        ArrayList<String> sources = new ArrayList<>(); // Liste de villes sources - Sert pour exploration en largeur

        TreeMap<String,ArrayList> treeSuccesseurs = new TreeMap(); // Treemap successeur - Clé : Villes, Valeur : Liste de villes
        TreeMap<String, Integer> treeNBPredecesseurs = new TreeMap<>(); // TreeMap Nb prédecesseurs - Clé : Villes, Valeur : nb de prédecesseurs

        ArrayList<String> listeVilleItineraire = new ArrayList<>();
        ArrayList<String> vendres = (ArrayList<String>) scenario.getVendeurs();
        ArrayList<String> acheteurs = (ArrayList<String>) scenario.getAcheteurs();
        ArrayList<String> villeVendres = new ArrayList();
        ArrayList<String> villeAcheteurs = new ArrayList();


        for (String vendeur : vendres){ // Ajoute ville vendeurs à villeVendres
            int nb =0;
            while (!vendeur.equals(noms.get(nb))){
                nb++;
            }
            villeVendres.add(villes.get(nb));
        }


        for (String acheteur : acheteurs){ // Ajoute ville acheteurs à villeAcheteurs
            int nb =0;
            while (!acheteur.equals(noms.get(nb))){
                nb++;
            }
            villeAcheteurs.add(villes.get(nb));
        }


// ----- CREATION DE treePredecesseurs ET treeNBPredecesseurs -----

        for (int i=0; i<villeVendres.size();i++){

            if(treeSuccesseurs.containsKey(villeVendres.get(i))){ // Vérifie si la ville[i] est déjà une clé

                treeSuccesseurs.get(villeVendres.get(i)).add(villeAcheteurs.get(i)); // Ajout à la treemap de la ville de l'acheteur


                if (treeNBPredecesseurs.get(villeAcheteurs.get(i)) == null){

                    treeNBPredecesseurs.put(villeAcheteurs.get(i),1); // 1 pred si elle n'a pas de pred avant
                }

                else{

                    int ii = treeNBPredecesseurs.get(villeAcheteurs.get(i)); // Ajoute un pred
                    ii+=1;
                    treeNBPredecesseurs.put(villeAcheteurs.get(i),ii);
                }
            }

// -----

            else{ // Si la ville n'est pas déjà clé -> pas de successeur

                ArrayList<String> arrayListVendeur = new ArrayList<>();
                ArrayList<String> arrayListAcheteur =new ArrayList<>();

                arrayListVendeur.add(villeAcheteurs.get(i));
                treeSuccesseurs.put(villeVendres.get(i),arrayListVendeur); // Valeurs par défaut
                treeNBPredecesseurs.put(villeVendres.get(i),1);


                if (treeNBPredecesseurs.get(villeAcheteurs.get(i)) == null){ // Création d'un puit temporaire ou final

                    treeNBPredecesseurs.put(villeAcheteurs.get(i),1);
                    treeSuccesseurs.put(villeAcheteurs.get(i),arrayListAcheteur);
                }

                else { // Ajout d'un prédécesseur

                    int ii = treeNBPredecesseurs.get(villeAcheteurs.get(i));
                    ii+=1;
                    treeNBPredecesseurs.put(villeAcheteurs.get(i),ii);
                }
            }
        }


// ----- PARCOURS DU GRAPHE -----


        ArrayList<String> list = new ArrayList<>();
        treeSuccesseurs.put("Velizy",list); // Vélizy en point de départ

        for (String str : villeVendres) {
            if (treeNBPredecesseurs.get(str)== 1 && !treeSuccesseurs.get("Velizy").contains(str)){ // Mise en place des succ de Vélizy
                list.add(str);
                treeSuccesseurs.put("Velizy",list);
            }

        }

        treeNBPredecesseurs.put("Velizy",0); // Vélizy - aucun pred
        sources.add("Velizy");

        while (sources.size()>0){ // Tant qu'il y a des sources

            if (!listeVilleItineraire.contains(sources.get(0))){ // 1er de la source pas dans itinéraire

                for (String ville : treeNBPredecesseurs.keySet()) {

                    if (treeNBPredecesseurs.get(ville) != 0 && treeSuccesseurs.get(sources.get(0)).contains(ville)){

                        Integer i = treeNBPredecesseurs.get(ville); // Retirer 1 dans les nb pred
                        i -=1;
                        treeNBPredecesseurs.put(ville,i);
                    }
                }

                listeVilleItineraire.add(sources.get(0));
                sources.remove(sources.get(0));

                for (String ville : treeNBPredecesseurs.keySet()) {
                    if (treeNBPredecesseurs.get(ville) == 0 && !listeVilleItineraire.contains(ville)){ // Ajout des nouvelles sources quand nb pred = 0
                        sources.add(ville);
                    }
                }

                for (String ville : treeNBPredecesseurs.keySet()) {

                    if (sources.size()==0) {

                        if(treeNBPredecesseurs.get(ville) != 0){ // S'il n'y a pas de ville = 0

                            int i = 1;

                            while (i<30 && sources.size() == 0){

                                if (treeNBPredecesseurs.get(ville) == i && !listeVilleItineraire.contains(ville)){ // Cherche les sources à i

                                    sources.add(ville);
                                }

                                i++;
                            }
                        }
                    }
                }
            }

            else {
                sources.remove(sources.get(0)); // Retire source qui est dans l'itinéraire
            }
        }

        listeVilleItineraire.add("Velizy"); // Ajoute Vélizy à la fin - Retour à la fin de l'itinéraire
        listVille = listeVilleItineraire; // Instanciation de l'itinéraire
    }


    //----- METHODES -----

    public void ajoutVille(String ville){ // Ajoute ville à l'itinéraire
        listVille.add(ville);
    }

    public void supprimeVille(String ville){ // Supprime ville à l'itinéraire
        listVille.remove(ville);
    }


    public static int calculeDistance(Itineraire itineraire) throws IOException {

        ArrayList<String>  villes = (ArrayList<String>) Lecture.lectureVille(new File("TourAPLI\\distances.txt")).get(0);
        ArrayList<ArrayList> distance = (ArrayList<ArrayList>) Lecture.lectureVille(new File("TourAPLI\\distances.txt")).get(1);

        int compteur =  0;
        int x = 0;

        for (int i = 0; i<itineraire.getListVille().size()-1; i++){ // Parcours listes

            int indice1 = 0;
            int indice2 = 0;

            while (!itineraire.getListVille().get(i).equals(villes.get(x))){ // Trouver distance entre les deux villes

                indice1 +=1;
                x+=1;
            }

            x = 0;

            while (!itineraire.getListVille().get(i+1).equals(villes.get(x))){

                indice2 +=1;
                x+=1;
            }
            x=0;
            compteur += (int) distance.get(indice1).get(indice2);
        }
        return compteur;
    }


    //----- ACCESSEURS -----

    public List getListVille() {
        return listVille;
    }


    //----- TO STRING -----

    public String toString(){
        return listVille.toString().replaceAll("\\[|\\]", "").replaceAll(", ","\n");
    }
}
