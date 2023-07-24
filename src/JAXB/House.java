package JAXB;
import javax.xml.bind.annotation.XmlRootElement;
// Імпорт інших необхідних пакетів


@XmlRootElement
public class House {
    private String name;

    public House() {
    }

    public House(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                '}';
    }
}
