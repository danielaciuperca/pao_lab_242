package service;

import model.*;

public class ShopService {
    private int lastIndex;

    public void addProduct(Shop shop, Product product) {
        //TODO to replace [0] with the next available index
        shop.getProducts()[0] = product;
    }
}
