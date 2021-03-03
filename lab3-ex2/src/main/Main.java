package main;

import model.*; //importa toate clasele din model
import service.*;

public class Main {
    public static void main(String[] args) {
        //test();

        ShopService shopService = new ShopService();
        Shop shop = new Shop();
        Product product = new Product("pen");
        shopService.addProduct(shop, product);
        shopService.printProducts(shop);
    }

    public static void test() {
        Product p = new Product();
//        System.out.println(p.name); -> name este private
        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.getPrice());
        System.out.println(p.isInStock());
        p.setName("mouse");//3.
        System.out.println(p.getName());

        Product p2 = new Product("telefon");
        System.out.println(p2.getName());

        Product p3 = new Product("laptop");
        System.out.println(p3.getName());
    }
}
