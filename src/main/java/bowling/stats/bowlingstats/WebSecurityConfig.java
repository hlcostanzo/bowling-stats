package bowling.stats.bowlingstats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private Environment environment;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Allow all access
        http.authorizeRequests().antMatchers("/").permitAll();
        http.authorizeRequests().antMatchers("/*.*").permitAll();
        http.authorizeRequests().antMatchers("/scripts/**").permitAll();
        http.authorizeRequests().antMatchers("/fonts/**").permitAll();
        http.authorizeRequests().antMatchers("/images/**").permitAll();
        http.authorizeRequests().antMatchers("/login").permitAll();

        if (environment.acceptsProfiles("local"))
        {
            http.authorizeRequests().antMatchers("/src/**").permitAll();
        }

        // Must be authenticated
        //http.authorizeRequests().anyRequest().authenticated();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
    }
}
