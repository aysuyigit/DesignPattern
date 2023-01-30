package behavioral.command;

public class GiveOrderCommand implements OrderCommand{
    private Order order;

    public GiveOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        this.order.give();
    }

}
