package behavioral.null_object2.model;

public class Ordered extends Order{
    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
