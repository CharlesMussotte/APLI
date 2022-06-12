package modele;

public class Membre {
    private String nomMembre;
    private Ville villeMembre;

    public Membre(String parNomMembre, Ville parVille){
        nomMembre = parNomMembre;
        villeMembre=parVille;
    }

    public String getNomMembre() {
        return nomMembre;
    }

    public Ville getVilleMembre() {
        return villeMembre;
    }
    public String toString(){return nomMembre +" habite à "+villeMembre;}
}
