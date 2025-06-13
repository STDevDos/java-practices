package com.froyo.mockitotest;

import java.util.logging.Logger;

import javax.security.auth.login.LoginException;


public class LoginController {
    private static final Logger log = Logger.getLogger(LoginController.class.getName());

    public LoginService loginService = new LoginService();

    public String login(UserForm userForm) {
        log.info(String.format("LoginController.login %s",userForm));
        try {
            if (userForm == null) {
                return "ERROR";
            } else if (loginService.login(userForm)) {
                return "OK";
            } else {
                return "KO";
            }
        } catch (Exception e) {
            log.warning(e.getMessage());
            return "ERROR";
        }
    }

    public void logout(UserForm userForm) throws LoginException {
        log.info(String.format("LoginController.logout %s",userForm));
        loginService.logout(userForm);
    }

}
