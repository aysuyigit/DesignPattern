package behavioral.null_object2.model;

public class NullOrder extends Order{
    @Override
    public String getName() {
        return "Sipariş bulunamadı.";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
