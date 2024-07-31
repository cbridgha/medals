package liberty.spring.medals;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
/* Declaring a Spring Boot Component that declares a spring bean producing a rest endpoint "medals" */
/* COMMENTTOCODE */
@Component
@Path("/medals")
public class MedalsController {

    @GET
    @Produces({"application/json"})
    public MedalResult getMedalResults() {
        ArrayList<MedalCount> allResults = new ArrayList<MedalCount>();
        allResults.add(new MedalCount("U.S.A","Gold: 5, Silver: 7, Bronze: 9"));
        allResults.add(new MedalCount("China","Gold: 8, Silver: 4, Bronze: 5"));
        allResults.add(new MedalCount("Australia","Gold: 4, Silver: 8, Bronze: 5"));
        return new MedalResult(allResults);
    }
}
