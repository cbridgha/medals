package liberty.spring.medals;

import org.springframework.stereotype.Component;
import java.util.ArrayList;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
/* A Spring Component that declares a spring controller class in this case, it declares a jakarta restful services endpoint "medals" */
/* COMMENTTOCODE */
@Component
@Path("/medals")
public class MedalsController {
/* ENDHOLE */

    
    /* This declares what is returned when a HTTP Get method is used against the endpoint, and the data produced will be of type "application/json" */
    /* COMMENTTOCODE */
    @GET
    @Produces({"application/json"})
    public MedalResult getMedalResults() {
        return MedalsController.initResults();
    }
    /* ENDHOLE */
    /* Init test data for demo */
    private static MedalResult initResults() {
        ArrayList<MedalCount> dummyResults = new ArrayList<MedalCount>();
            dummyResults.add(new MedalCount("U.S.A","Gold: 5, Silver: 7, Bronze: 9"));
            dummyResults.add(new MedalCount("China","Gold: 8, Silver: 4, Bronze: 5"));
            dummyResults.add(new MedalCount("Australia","Gold: 4, Silver: 8, Bronze: 5"));
            return new MedalResult(dummyResults);
    }
}