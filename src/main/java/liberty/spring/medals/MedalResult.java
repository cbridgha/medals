package liberty.spring.medals;

import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
/* A Jakarta root xml binding that helps serialize the Bean class MedalResult, including embedded MedalCount fields */
/* COMMENTTOCODE */
@XmlRootElement(namespace = "liberty.spring.medals.result")
public class MedalResult {

    private ArrayList<MedalCount> counts;

    protected MedalResult() {
    }

    public MedalResult(ArrayList<MedalCount> counts) {
        this.counts = counts;
    }

    /**
     * @return the country counts
     */
    public ArrayList<MedalCount> getCounts() {
        return counts;
    }
}
/* ENDHOLE */