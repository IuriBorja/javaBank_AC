package org.academiadecodigo.javabank.controller;

import org.academiadecodigo.javabank.model.Bank;
import org.academiadecodigo.javabank.service.AuthS;
import org.academiadecodigo.javabank.view.LoginView;

/**
 * The {@link LoginView} controller
 */
public class LoginController extends AbstractController {

    private Controller nextController;
    private AuthS authS;
    private LoginView loginView;


    /**
     * Sets the next controller
     *
     * @param nextController the next controller to be set
     */
    public void setNextController(Controller nextController) {
        this.nextController = nextController;
    }

    /**
     * Sets the bank
     *
     * @param bank the bank to be set
     */


    /**
     * Identifies the logged in customer
     *
     * @param id the customer id
     */
    public void onLogin(int id) {

        if (authS.authenticate(id)) {
            nextController.init();
        } else {
            loginView.setTriedAuthenticate(true);
            loginView.show();
        }
    }

    public void setAuth(AuthS authS) {
        this.authS = authS;
    }

    public void setLoginView(LoginView loginView) {
        this.loginView = loginView;
    }
}