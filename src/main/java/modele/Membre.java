package modele;

public class Membre {
    private String nomMembre;
    private Ville villeMembre;


    //----- CONSTRUCTEURS -----

    public Membre(String parNomMembre, Ville parVille){
        nomMembre = parNomMembre;
        villeMembre=parVille;
    }


    //----- ACCESSEURS -----

    public String getNomMembre() {
        return nomMembre;
    }

    public Ville getVilleMembre() {
        return villeMembre;
    }

    //----- TO STRING -----
    
    public String toString(){
        return nomMembre +" habite à "+villeMembre;
        }

}
