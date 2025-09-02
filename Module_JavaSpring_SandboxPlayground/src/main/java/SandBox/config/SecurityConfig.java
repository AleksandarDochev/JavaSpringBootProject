package SandBox.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        // These endpoints will be public
                        .requestMatchers("/api/public/**", "/login", "/home").permitAll()
                        // All other requests must be authenticated
                        .anyRequest().authenticated()
                )
                .formLogin(formLogin -> formLogin.permitAll())
                .csrf(csrf -> csrf.disable());

        return http.build();
    }
}
