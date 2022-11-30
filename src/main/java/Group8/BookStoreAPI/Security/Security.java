package Group8.BookStoreAPI.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class Security  {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails employee = User.withDefaultPasswordEncoder()
                .username("employee")
                .password("employee")
                .roles("EMPLOYEE")
                .build();
        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("Mrh0726!.")
                .roles("ADMIN")
                .build();


        return new InMemoryUserDetailsManager(employee, admin);
    }

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        return http
                .csrf(csrf -> csrf.disable())
                .authorizeRequests(auth -> {
                    auth.antMatchers("/").permitAll();
                    auth.antMatchers("/books/getallbooks").permitAll();
                    auth.antMatchers("/books/getallauthors").permitAll();
                    auth.antMatchers("/books/getBookByISBN/{isbn}").hasRole("EMPLOYEE");
                    auth.antMatchers("/books/getBooksByAuthor/{author}").hasRole("EMPLOYEE");
                    auth.antMatchers("/books/insert/book").hasRole("ADMIN");
                    auth.antMatchers("/books/insert/author").hasRole("ADMIN");
                })
                .httpBasic(Customizer.withDefaults())
                .build();

    }

}