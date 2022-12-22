package adapter.domain;

public class AccountService {

    public Account findAccountByUserName(String name) {
        Account account = new Account(name, "1234", name + "@naver.com");
        return account;
    }

}
