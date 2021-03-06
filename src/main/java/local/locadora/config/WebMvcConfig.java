package local.locadora.config;


import local.locadora.controller.FilmeFormatter;
import local.locadora.controller.UsuarioFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Spring MVC configuration.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {


	@Override
    public void addFormatters(FormatterRegistry formatterRegistry) {
        formatterRegistry.addFormatter(new UsuarioFormatter());
        formatterRegistry.addFormatter(new FilmeFormatter());
    }
}
