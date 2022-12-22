package bridge;

public class KimHater implements UserValidator {
    @Override
    public void validate(User user) {
        if(user.getName().equalsIgnoreCase("kim")) {
            throw new IllegalArgumentException("I hate kim");
        }
    }
}
