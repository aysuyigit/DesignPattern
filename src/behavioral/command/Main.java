package behavioral.command;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.state = "Coffee";

        TakeOrderCommand takeOrderCommand = new TakeOrderCommand(order);
        GiveOrderCommand giveOrderCommand = new GiveOrderCommand(order);

        Broker broker = new Broker();
        broker.addCommand(takeOrderCommand);
        broker.addCommand(giveOrderCommand);
    }


}
