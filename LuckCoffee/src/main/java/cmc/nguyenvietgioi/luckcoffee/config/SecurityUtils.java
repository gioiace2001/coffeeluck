package cmc.nguyenvietgioi.luckcoffee.config;
import cmc.nguyenvietgioi.luckcoffee.domain.User;
import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityUtils  {
    public  static User getPrincipal() {
        return (User) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal();
    }
}
