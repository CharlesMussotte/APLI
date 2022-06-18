package modele;

import java.util.ArrayList;
import java.util.TreeMap;

public class Graph {
    private TreeMap degreEntrant;
    private ArrayList sommets;
    private ArrayList[] voisins;


    //----- CONSTRUCTEURS -----

    public Graph (TreeMap parDegre,ArrayList parSommet, ArrayList[] parVoisins){
        degreEntrant=parDegre;
        sommets=parSommet;
        voisins=parVoisins;
    }


    //----- ACCESSEURS -----

    public ArrayList getSommets() {
        return sommets;
    }

    public TreeMap getDegreEntrant() {
        return degreEntrant;
    }

    public ArrayList[] getVoisins() {
        return voisins;
    }


    //----- TO STRING -----
    
    public String toString(){
        return sommets.toString();
    }
}
