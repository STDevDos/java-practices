package com.froyo.mockitotest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class LoginControllerTest {

    // Mocking objects
    @InjectMocks
    LoginController loginController;

    @Mock
    LoginService loginService;

    // Test data
    UserForm userForm = new UserForm("foo", "bar");

    /**
     * https://www.baeldung.com/mockito-verify
     */
    @Test
    void testLoginOk() {
        // Setting expectations (stubbing methods)
        when(loginService.login(userForm)).thenReturn(true);

        // Exercise SUT
        String responseLogin = loginController.login(userForm);

        // Verification
        assertEquals("OK", responseLogin);
        verify(loginService).login(userForm); //verificando que se haya mandado llamar el método de login
        verifyNoMoreInteractions(loginService); //verificando que no exista ninguna interacción con loginService de aquí en adelante.

    }

    @Test
    void testLoginKo() {
        // Setting expectations (stubbing methods)
        when(loginService.login(userForm)).thenReturn(false);

        // Exercise SUT
        String responseLogin = loginController.login(userForm);

        // Verification
        assertEquals("KO", responseLogin);
        verify(loginService).login(userForm);
        verifyZeroInteractions(loginService);
    }


}
