package modele;

import java.util.ArrayList;
import java.util.TreeMap;

public class Graph {
    private TreeMap degreEntrant;
    private ArrayList sommets;
    private ArrayList[] voisins;

    public Graph (TreeMap parDegre,ArrayList parSommet, ArrayList[] parVoisins){
        degreEntrant=parDegre;
        sommets=parSommet;
        voisins=parVoisins;
    }

    public ArrayList getSommets() {
        return sommets;
    }

    public TreeMap getDegreEntrant() {
        return degreEntrant;
    }

    public ArrayList[] getVoisins() {
        return voisins;
    }
    public String toString(){return sommets.toString();}
}
