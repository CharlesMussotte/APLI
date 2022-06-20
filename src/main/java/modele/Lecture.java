package modele;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Lecture {

    // ----- CONSTRUCTEURS -----

    public static Scenario lectureScenario (File fichier) throws IOException {
        Scenario scenario = new Scenario();
        BufferedReader bufferEntree = new BufferedReader(new FileReader(fichier));
        String ligne ;
        StringTokenizer tokenizer ;
        do {
            ligne = bufferEntree.readLine ();
            if (ligne != null) {
                tokenizer = new StringTokenizer(ligne ," ->");
                scenario.ajoutVendeurAcheteur(tokenizer.nextToken(), tokenizer.nextToken());
            }
        }
        while (ligne != null );
        bufferEntree.close();
        return scenario;
    }

    // ----- LECTURES -----

    public static Membres lectureMembres (File fichier) throws IOException {
        Membres membres = new Membres();
        BufferedReader bufferEntree = new BufferedReader(new FileReader(fichier));
        String ligne ;
        StringTokenizer tokenizer ;
        do {
            ligne = bufferEntree.readLine ();
            if (ligne != null) {
                tokenizer = new StringTokenizer(ligne ," ");
                membres.ajoutMembre(tokenizer.nextToken(), tokenizer.nextToken());
            }
        }
        while (ligne != null );
        bufferEntree.close();
        return membres;
    }

    public static ArrayList lectureVille (File fichier) throws IOException {
        ArrayList<ArrayList> distanceEtVille = new ArrayList();
        ArrayList<String> villes = new ArrayList<>();
        ArrayList<ArrayList<Integer>> touteDistance = new ArrayList<>();
        BufferedReader bufferEntree = new BufferedReader(new FileReader(fichier));
        String ligne ;
        StringTokenizer tokenizer ;
        do {
            ligne = bufferEntree.readLine ();
            if (ligne != null) {
                tokenizer = new StringTokenizer(ligne ," ");
                villes.add(tokenizer.nextToken());
                ArrayList<Integer> distance = new ArrayList<>();
                for (int i=0; i<29; i++){
                    distance.add(Integer.valueOf(tokenizer.nextToken()));
                }
                touteDistance.add(distance);
            }
        }
        while (ligne != null );
        bufferEntree.close();
        distanceEtVille.add(villes);
        distanceEtVille.add(touteDistance);
        return distanceEtVille;
    }




    // ----- METHODES -----

    public static int compteLigne(File fichier) throws IOException {
        int nbrLine = 0;
        BufferedReader bufferEntree = new BufferedReader(new FileReader(fichier));
        String ligne ;
        StringTokenizer tokenizer ;
        do {
            ligne = bufferEntree.readLine ();
            if (ligne != null) {
                nbrLine +=1;
            }
        }
        while (ligne != null );
        bufferEntree.close();
        return nbrLine;
    }

}
