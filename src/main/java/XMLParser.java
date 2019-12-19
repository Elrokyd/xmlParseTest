import model.Order;
import model.Services;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Collections;

public class XMLParser {

    public void parse(String s) {
        File xmlTest = new File(s);
        if (xmlTest.exists())
            createStructure(xmlTest);

    }

    private void createStructure(File xmlTest) {
        JAXBContext jaxbContext;
        try{
            jaxbContext = JAXBContext.newInstance(Order.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Order order = (Order) unmarshaller.unmarshal(xmlTest);
            order.getOrderServ();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
