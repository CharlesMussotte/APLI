-import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.junit.jupiter.api.Assertions.*;



class ItineraireTestAjouterUneVille {

    @org.junit.jupiter.api.Test

    void ajouterUneVille() {
        
        Ville villeDeTest = new Ville("TestLand",[]);

        assertEquals(False,Itineraire.ajouterUneVille())// Teste lorsque la méthode est appelée vide

        assertEquals(True,Itineraire.ajouterUneVille(villeDeTest))// Teste une ville à ajouter


    }
}