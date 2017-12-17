package bowling.stats.bowlingstats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter
{
    @Autowired
    private Environment environment;

    @Override
    public void addViewControllers (ViewControllerRegistry registry)
    {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/login").setViewName("login");
    }

}
