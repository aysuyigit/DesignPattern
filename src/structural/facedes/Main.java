package structural.facedes;

import structural.facedes.facedes.CrossCuttingConcernsFacade;
import structural.facedes.services.IProductService;
import structural.facedes.services.ProductService;

public class Main {
    public static void main(String[] args) {
        IProductService productService = new ProductService(new CrossCuttingConcernsFacade());
        productService.save();
    }
}
