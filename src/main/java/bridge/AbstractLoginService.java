package bridge;

public abstract class AbstractLoginService {
    private final UserValidator userValidator;

    public AbstractLoginService(UserValidator userValidator) {
        this.userValidator = userValidator;
    }

    protected void validateLogin(User user) {
        userValidator.validate(user);
    }
}
