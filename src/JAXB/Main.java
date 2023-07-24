package JAXB;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
// Імпорт інших необхідних пакетів

@XmlRootElement
public class Main {
    public static void main(String[] args) {
        // Створення даних для міста
        House house1 = new House("Red House");
        House house2 = new House("Blue House");
        House house3 = new House("Green House");

        List<String> housesOnMainStreet = new ArrayList<>();
        housesOnMainStreet.add(house1.getName());
        housesOnMainStreet.add(house2.getName());

        List<String> housesOnSecondAvenue = new ArrayList<>();
        housesOnSecondAvenue.add(house3.getName());

        Street mainStreet = new Street("Main Street", housesOnMainStreet);
        Street secondAvenue = new Street("Second Avenue", housesOnSecondAvenue);

        List<Street> streets = new ArrayList<>();
        streets.add(mainStreet);
        streets.add(secondAvenue);

        City city = new City("Kiev", "big", streets);

        // Перетворення об'єкта в XML
        try {
            JAXBContext context = JAXBContext.newInstance(City.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(city, new File("city.xml"));
            System.out.println("XML файл успішно створено.");
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        // Перетворення XML у об'єкт
        try {
            File file = new File("city.xml");
            JAXBContext context = JAXBContext.newInstance(City.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            City unmarshalledCity = (City) unmarshaller.unmarshal(file);
            System.out.println("Об'єкт City успішно відновлено з XML:");
            System.out.println(unmarshalledCity);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
