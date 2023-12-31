package org.academiadecodigo.javabank.view;

import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.javabank.controller.LoginController;

/**
 * A view shown at login
 *
 * @see LoginController
 */
public class LoginView extends AbstractView {

    private LoginController loginController;
    private boolean triedToAuthenticate;


    public void setTriedAuthenticate(boolean authenticated) {
        this.triedToAuthenticate = authenticated;
    }

    /**
     * Sets the controller responsible for rendering the view
     *
     * @param loginController the login controller to set
     */
    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }

    /**
     * @see View#show()
     */
    @Override
    public void show() {
        if (!triedToAuthenticate) {
            System.out.println(Messages.VIEW_LOGIN_MESSAGE);
            showBankName();
            showLoginPrompt();
        } else {
            System.out.println(Messages.VIEW_LOGIN_ERROR);
            showLoginPrompt();
        }
    }

    private void showBankName() {
        System.out.println("\n" + Messages.VIEW_LOGIN_WELCOME);
    }

    private void showLoginPrompt() {

        IntegerInputScanner scanner = new IntegerInputScanner();
        scanner.setMessage("\n" + Messages.VIEW_LOGIN_MESSAGE);
        scanner.setError(Messages.VIEW_LOGIN_ERROR);
        loginController.onLogin(prompt.getUserInput(scanner));
    }
}
