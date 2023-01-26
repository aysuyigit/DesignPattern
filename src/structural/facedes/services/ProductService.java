package structural.facedes.services;

import structural.facedes.facedes.CrossCuttingConcernsFacade;

public class ProductService implements  IProductService{
    CrossCuttingConcernsFacade crossCuttingConcernsFacade;

    public ProductService(CrossCuttingConcernsFacade crossCuttingConcernsFacade) {
        this.crossCuttingConcernsFacade = crossCuttingConcernsFacade;
    }

    @Override
    public void save() {
        // authorization
        // caching
        // logging
        crossCuttingConcernsFacade.auth.auth();
        crossCuttingConcernsFacade.caching.cache();
        crossCuttingConcernsFacade.logger.log();
        System.out.println("Product saved");
    }
}
