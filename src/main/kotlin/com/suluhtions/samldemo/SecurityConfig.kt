import org.springframework.context.annotation.Bean
import org.springframework.security.authorization.AuthorityReactiveAuthorizationManager.hasAuthority
import org.springframework.security.config.Customizer.withDefaults
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity.http
import org.springframework.security.web.SecurityFilterChain

@EnableWebSecurity
class MyCustomSecurityConfiguration {
    @Bean
    open fun filterChain(http: HttpSecurity): SecurityFilterChain {
        http.authorizeRequests {
                authorize -> authorize.anyRequest().authenticated()
        }
            .saml2Login {}

        return http.build();
    }
}