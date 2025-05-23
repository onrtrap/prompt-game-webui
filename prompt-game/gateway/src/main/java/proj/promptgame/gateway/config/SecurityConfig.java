package proj.promptgame.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig{

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        System.out.println("Receiving Security Request...");
        http.authorizeHttpRequests((requests) -> requests
                .requestMatchers("/api/**").permitAll()
                .anyRequest().permitAll());

        return http.build();
    }
}