package bridge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginServiceTest {

    @Test
    void loginThrowsException() {
        User kim = new User("kim", "1234");

        LoginService loginService = new LoginService(new KimHater());
        Assertions.assertThrows(IllegalArgumentException.class, () -> loginService.login(kim));
    }

    @Test
    void loginSuccessfully() {
        User youn = new User("youn", "1234");

        LoginService loginService = new LoginService(new KimHater());
        loginService.login(youn);
    }

}