package liberty.spring.medals;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
/* Registers the Jersey equivalent of restful service Application. By adding a Spring Component, it marks the class as a controller stereotype in this case */
/* COMMENTTOCODE */
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(MedalsController.class);
    }
}
/* ENDHOLE */