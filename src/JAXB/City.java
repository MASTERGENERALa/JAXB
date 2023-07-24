package JAXB;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
// Імпорт інших необхідних пакетів


@XmlRootElement
public class City {
    private String name;
    private String size;
    private List<Street> streets;

    public City() {
    }

    public City(String name, String size, List<Street> streets) {
        this.name = name;
        this.size = size;
        this.streets = streets;
    }

    @XmlAttribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlAttribute
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @XmlElement(name = "street")
    public List<Street> getStreets() {
        return streets;
    }

    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", streets=" + streets +
                '}';
    }
}
