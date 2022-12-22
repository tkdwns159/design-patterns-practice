package bridge;

public class LoginService extends AbstractLoginService {
    public LoginService(UserValidator userValidator) {
        super(userValidator);
    }

    public void login(User user) {
        validateLogin(user);
        System.out.println("Successful Login!");
    }
}
