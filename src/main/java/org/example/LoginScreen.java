package org.example;

/**
 * @author Gabriel Viegas Dantas
 * @version 1.0
 * @since Release 1.0 da aplicacao
 */

public class LoginScreen {

    private String name;

    private String password;

    public LoginScreen(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public LoginScreen() {}

    /**
     *
     * @param name O nome de usuario necessario para realizar o login
     * @param password A senha de usuario necessaria para realizar o login
     * @return Se o nome de usuario e a senha forem corretos, retorna true, caso contrario, retorna false
     */

    public boolean compareNameAndPassword(String name, String password) {
        return name.equalsIgnoreCase("admin") && password.equalsIgnoreCase("123");
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
