import model.Order;

import java.io.File;

public class App {
    private static final String nameValueTask1 = "ВИД_ДОК", nameValueTask2 = "ГРАЖДАНСТВО", stepValueTask2 = "1";

    public static void main(String[] args) {
        File file = new File("resources/qwe.xml");
        XMLParser xmlParser = new XMLParser();
        Order order = xmlParser.parse(file.getAbsolutePath());

        OrderManager orderManager = new OrderManager();
        orderManager.sortParLists(order, nameValueTask1);
        orderManager.sortParsAttribute(order, nameValueTask2, stepValueTask2);
    }
}
