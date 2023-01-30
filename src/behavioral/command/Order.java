package behavioral.command;

public class Order {

    public String state;

    public void take(){
        System.out.println("Take: " + state);
    }

    public void give(){
        System.out.println("Give: " + state);
    }
}
