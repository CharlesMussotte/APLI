package modele;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Lecture {
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
