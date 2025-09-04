package SandBox.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SandboxSecurityConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails user = User.builder()
                .username("john")
                .password("{noop}test123") // {noop} indicates that no encoding is used
                .roles("EMPLOYEE")
                .build();

        return new InMemoryUserDetailsManager(user);
    }
    public void testVoidMethod(){
        System.out.println("testVoidMethod called");
        InMemoryUserDetailsManager userDetailsManager = userDetailsManager();
        UserDetails user = User.builder()
                .username("john")
                .password("{noop}test123") // {noop} indicates that no encoding is used
                .roles("EMPLOYEE")
                .build();
    }
}
