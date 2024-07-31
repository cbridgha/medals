package liberty.spring.medals;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
/* Registers the Jersey endpoint */
/* COMMENTTOCODE */
@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(MedalsController.class);
    }
}