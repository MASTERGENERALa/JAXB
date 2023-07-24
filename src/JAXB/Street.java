package JAXB;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
// Імпорт інших необхідних пакетів


@XmlRootElement
public class Street {
    private String name;
    private List<String> houses;

    public Street() {
    }

    public Street(String name, List<String> houses) {
        this.name = name;
        this.houses = houses;
    }

    @XmlAttribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "house")
    public List<String> getHouses() {
        return houses;
    }

    public void setHouses(List<String> houses) {
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "Street{" +
                "name='" + name + '\'' +
                ", houses=" + houses +
                '}';
    }
}
