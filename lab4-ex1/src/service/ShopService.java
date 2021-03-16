package service;

import model.*;

public class ShopService {
    private NotificationService notificationService;

    public ShopService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void addProduct(Shop shop, Product product) {
        int nextAvailableIndex = getNumberOfProducts(shop);
        shop.getProducts()[nextAvailableIndex] = product;

        String message = "Product " + product.getName() + " was added to the shop";
        Receiver receiver = new Receiver("John", "john@gmail.com");
        notificationService.sendNotification(new Notification(message, "office@shop.com", receiver));
    }

    public void printProductsDetails(Shop shop) {
        for(Product p : shop.getProducts()) {
            if(p != null) {
                System.out.println(p);
            }
        }
    }

    private int getNumberOfProducts(Shop shop) {
        int numberOfProducts = 0;
        for(Product p : shop.getProducts()) {
            if(p != null) {
                numberOfProducts++;
            }
        }
        return numberOfProducts;
    }
}
