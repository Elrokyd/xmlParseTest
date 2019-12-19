import model.Order;
import model.Par;
import model.ParList;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OrderManager {
    void sortParLists(Order order, String nameValue) {
        order.getOrderServ().forEach(services -> {
            services.getServList().forEach(serv -> {
                serv.getPars().forEach(pars -> {
                    Optional<Par> optionalPar = pars.getPar().stream()
                            .filter(par -> par.getName().equals(nameValue)).findFirst();

                    optionalPar.ifPresent(par -> {
                        List<ParList> result = par.getParListItems();
                        result.sort(Comparator.comparing(ParList::getValue));
                        result.forEach(parList -> System.out.println(parList.getValue()));
                    });
                });
            });
        });
    }
}
