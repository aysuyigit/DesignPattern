package behavioral.null_object2;

import behavioral.null_object2.model.Order;
import behavioral.null_object2.repositories.OrderRepo;

public class Main {
    public static void main(String[] args) {
        Order ord1 = OrderRepo.getOrder("Kahve");
        Order ord2 = OrderRepo.getOrder("Çay");
        Order ord3 = OrderRepo.getOrder("Su");

        System.out.println(ord1.getName());
        System.out.println(ord2.getName());
        System.out.println(ord3.getName());
    }
}
