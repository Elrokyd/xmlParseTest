import model.Order;

public class App {
    private static final String nameValue = "ВИД_ДОК";

    public static void main(String[] args) {
        XMLParser xmlParser = new XMLParser();
        Order order = xmlParser.parse("D:\\IdeaProjects\\ParserSBERBANKUS\\src\\main\\resources\\qwe.xml");

        OrderManager orderManager = new OrderManager();
        orderManager.sortParLists(order, nameValue);
    }
}
