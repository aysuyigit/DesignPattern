package structural.decarator.decorators;

import structural.decarator.models.Phone;

public class PhoneDecorator implements Phone {
    public Phone phone;
    public PhoneDecorator(Phone phone){
        this.phone = phone;
    }
    @Override
    public void model() {
        phone.model();
    }
}
