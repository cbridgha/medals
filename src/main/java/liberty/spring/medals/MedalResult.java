package liberty.spring.medals;

import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
/* Declares a Jakarta root xml binding to class MedalResult */
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