package structural.adapter;

import structural.adapter.adapters.MailAdapter;
import structural.adapter.logging.DBLogger;
import structural.adapter.logging.FileLogger;
import structural.adapter.services.CustService;
import structural.adapter.services.ICustService;

public class Main {
    public static void main(String[] args) {
        ICustService customerService = new CustService(new FileLogger());
        customerService.add();

        System.out.println("**************");

        ICustService customerService1 = new CustService(new DBLogger());
        customerService1.add();

        System.out.println("**************");


        ICustService customerService2 = new CustService(new MailAdapter());
        customerService2.add();
    }
}

