import model.Order;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

class XMLParser {

    private Order order;

    Order parse(String s) {
        File xmlTest = new File(s);
        if (xmlTest.exists())
            createStructure(xmlTest);
        return order;
    }

    private void createStructure(File xmlTest) {
        JAXBContext jaxbContext;
        try{
            jaxbContext = JAXBContext.newInstance(Order.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            order = (Order) unmarshaller.unmarshal(xmlTest);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
