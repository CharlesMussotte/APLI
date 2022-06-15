-import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.junit.jupiter.api.Assertions.*;



class ScenarioTestAjouterUnUtilisateur {

    @org.junit.jupiter.api.Test

    void ajouterUnUtilisateur() {
        
        Utilisateur utilisateurDeTest = new Utilisateur("Jean",new );

        assertEquals(False,Scenario.ajouterUnUtilisateur()); // Teste sans paramètre

        assertEquals(True,Senario.ajouterUnUtilisateur(utilisateurDeTest)); // Teste l'utilisateur défini


    }
}