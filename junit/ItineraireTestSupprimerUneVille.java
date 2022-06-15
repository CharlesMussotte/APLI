-import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.junit.jupiter.api.Assertions.*;



class ItineraireTestSupprimerUneVille {

    @org.junit.jupiter.api.Test

    void supprimerUneVille() {
        
        Ville villeDeTest = new Ville("TestLand",[]);

        assertEquals(False,Itineraire.supprimerUneVille())// Teste lorsque la méthode est appelée vide

        assertEquals(True,Itineraire.supprimerUneVille(villeDeTest))// Teste une ville à supprimer


    }
}