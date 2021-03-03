package service;

import model.*;

public class ShopService {
//    private Shop shop;

    public void addProduct(Shop shop, Product product) {
        shop.getProducts()[0] = product;
    }

    public void printProducts(Shop shop) {
        for(Product product : shop.getProducts()) {
            if(product != null) {
                System.out.println(product.getName());
            }
        }
    }
}
