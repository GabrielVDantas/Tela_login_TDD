import org.example.LoginScreen;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * @author Gabriel Viegas Dantas
 * @version 1.0
 * @since Release 1.0 da aplicacao
 */
public class LoginTest {

    LoginScreen loginScreen = new LoginScreen();

    /**
     * Cenario 01 - O nome de usuario e a senha estao corretos
     */
   @Test
   @DisplayName("Usuário consegue realizar login pois inseriu os dados corretos")
    public void signInSuccessTest() {
        LoginScreen loginScreenCorrect = new LoginScreen("admin", "123");

        boolean signInTest = loginScreen.compareNameAndPassword(loginScreenCorrect.getName(), loginScreenCorrect.getPassword());
       assertTrue(signInTest);
    }

    /**
     * Cenario 02 - O nome de usuario e a senha estao incorretos
     */
    @Test
    @DisplayName("Usuário não consegue realizar login pois não inseriu os dados corretos")
    public void signInFailTest1() {
        LoginScreen loginScreenIncorrect = new LoginScreen("Gabriel", "abc123");

        boolean signInTest = loginScreen.compareNameAndPassword(loginScreenIncorrect.getName(), loginScreenIncorrect.getPassword());
        assertFalse(signInTest);
    }

    /**
     * Cenario 03 - O nome de usuario esta correto e a senha esta incorreta
     */
    @Test
    @DisplayName("Usuário não consegue realizar login pois não inseriu a senha correta")
    public void signInFailTest2() {
        LoginScreen loginScreenIncorrect = new LoginScreen("admin", "abc123");

        boolean signInTest = loginScreen.compareNameAndPassword(loginScreenIncorrect.getName(), loginScreenIncorrect.getPassword());
        assertFalse(signInTest);
    }

    /**
     * Cenario 04 - O nome de usuario esta incorreto e a senha esta incorreta
     */
    @Test
    @DisplayName("Usuário não consegue realizar login pois não inseriu o nome de usuário correto")
    public void signInFailTest3() {
        LoginScreen loginScreenIncorrect = new LoginScreen("Gabriel", "123");

        boolean signInTest = loginScreen.compareNameAndPassword(loginScreenIncorrect.getName(), loginScreenIncorrect.getPassword());
        assertFalse(signInTest);
    }

}
