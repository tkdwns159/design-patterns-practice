package adapter.domain.adapter;

import adapter.domain.AccountService;
import adapter.service.UserDetails;
import adapter.service.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    private final AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String name) {
        return new AccountUserDetails(accountService.findAccountByUserName(name));
    }
}
