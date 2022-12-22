package adapter.service;

public interface UserDetailsService {
    UserDetails loadUser(String name);
}
