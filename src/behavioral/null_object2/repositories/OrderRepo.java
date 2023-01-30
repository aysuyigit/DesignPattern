package behavioral.null_object2.repositories;

import behavioral.null_object2.model.NullOrder;
import behavioral.null_object2.model.Order;
import behavioral.null_object2.model.Ordered;

public class OrderRepo {
    public static final String[] orders =
                        {"Kahve","Çay","Su"};

    public static Order getOrder(String name){
        for(int i=0; i<orders.length; i++){
            if(orders[i].equalsIgnoreCase(name)){
                Ordered ordered = new Ordered();
                ordered.name = name;
                return ordered;
            }
        }
        return new NullOrder();
    }
}
