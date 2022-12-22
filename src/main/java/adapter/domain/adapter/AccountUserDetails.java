package adapter.domain.adapter;

import adapter.domain.Account;
import adapter.service.UserDetails;

public class AccountUserDetails implements UserDetails {
    private final Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
