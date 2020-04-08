package com.froyo.mockitotest;

import lombok.extern.java.Log;

import javax.security.auth.login.LoginException;

@Log
public class LoginController {

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
