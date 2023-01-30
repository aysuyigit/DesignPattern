package behavioral.command;

public class TakeOrderCommand  implements  OrderCommand{

    private Order order;

    public  TakeOrderCommand(Order order){
        this.order=order;
    }

    @Override
    public void execute() {
        this.order.take();
    }
}
