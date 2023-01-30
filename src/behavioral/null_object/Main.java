package behavioral.null_object;

import behavioral.null_object.loggers.DBLogger;
import behavioral.null_object.loggers.StubLogger;
import behavioral.null_object.services.CustService;
import behavioral.null_object.services.ICustService;

public class Main {
    public static void main(String[] args) {
        ICustService custService = new CustService(new DBLogger());
        custService.add();

        ICustService custService1 = new CustService(new StubLogger());
        custService1.add();
    }

}
