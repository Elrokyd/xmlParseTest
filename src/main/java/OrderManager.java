import model.Order;
import model.Par;
import model.ParList;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrderManager {
    // Формирование коллекции, содержащая все виды документов
    void sortParLists(Order order, String nameValue) {
        System.out.println("<<<<< TASK #1 >>>>>");
        order.getOrderServ().forEach(services -> {
            services.getServList().forEach(serv -> {
                serv.getPars().forEach(pars -> {
                    List<Par> parList = pars.getPar().stream()
                            .filter(par -> par.getName().equals(nameValue)).collect(Collectors.toList());
                    parList.forEach(par -> {
                        List<ParList> result = par.getParListItems();
                        result.sort(Comparator.comparing(ParList::getValue));
                        result.forEach(parListItem -> System.out.println(parListItem.getValue()));
                        System.out.println("\n\n");
                    });
                });
            });
        });
        System.out.println("\n\n\n\n");
    }
    // Вывод имен и значений всех атрибутов для par с заданными атрибутами step и name
    void sortParsAttribute(Order order, String nameValueTask2, String stepValue) {
        System.out.println("<<<<< TASK #2 >>>>>");
        order.getOrderServ().forEach(services -> {
            services.getServList().forEach(serv -> {
                serv.getPars().forEach(pars -> {
                    pars.getPar().stream()
                            .filter(par -> par.getName().equals(nameValueTask2) && (par.getStep().equals(stepValue)))
                            .forEach(par -> {
                                ArrayList<String> parNameVal = new ArrayList<>();
                                Method[] methods = par.getClass().getMethods();
                                for (Method method : methods) {
                                    if (method.getName().startsWith("get") && !method.getName().equals("getParListItems") && !method.getName().equals("getClass")) {
                                        try {
                                            parNameVal.add(method.getName().replaceAll("(^get)", "") + "=" + (method.invoke(par) != null ? method.invoke(par) : ""));
                                        } catch (IllegalAccessException | InvocationTargetException e) {
                                        }
                                    }
                                }
                                parNameVal.forEach(System.out::println);
                                System.out.println("\n\n");
                            });
                });
            });
        });
    }
}
