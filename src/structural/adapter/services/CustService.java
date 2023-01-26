package structural.adapter.services;

import structural.adapter.logging.ILogger;

public class CustService implements ICustService{
    private ILogger logger;

    public CustService(ILogger logger) {

        this.logger = logger;
    }

    @Override
    public void add() {
        logger.log();
        System.out.println("Customer eklendi.");
    }
}
