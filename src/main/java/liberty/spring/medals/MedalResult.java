package liberty.spring.medals;

import jakarta.xml.bind.annotation.XmlRootElement;
//import jakarta.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
/* Declares an xml binding to object MedalCount */
/* COMMENTTOCODE */
@XmlRootElement(namespace = "liberty.spring.medals.result")
public class MedalResult {

 //   @XmlElement(name = "counts")
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