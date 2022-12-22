package adapter.service;

import adapter.domain.AccountService;
import adapter.domain.adapter.AccountUserDetailsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserDetailsServiceTest {

    @Test
    void findUser() {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);

        String name = "hello";
        UserDetails userDetails = userDetailsService.loadUser(name);

        Assertions.assertEquals(name, userDetails.getUsername());
        Assertions.assertEquals("1234", userDetails.getPassword());
    }

}