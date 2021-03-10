package main;

import model.*;
import service.*;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Shop shop = new Shop();
        ShopService shopService = new ShopService();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Please type a command: ");
            String line = scanner.nextLine();
            switch(line) {
                case "add" :
                    System.out.println("Please choose a product type: ");
                    String productType = scanner.nextLine();
                    System.out.println("Please specify the product details: ");
                    switch(productType) {
                        case "bicycle" :
                            String productDetails = scanner.nextLine();
                            String[] attributes = productDetails.split("/");
                            String name = attributes[0];
                            double price = Double.valueOf(attributes[1]);
                            int stock = Integer.valueOf(attributes[2]);
                            String model = attributes[3];
                            boolean limitedEdition = Boolean.valueOf(attributes[4]);
                            int height = Integer.valueOf(attributes[5]);
                            Product product = new Bicycle(new Random().nextInt(100),
                                    name, price, stock, model, limitedEdition, height);
                            shopService.addProduct(shop, product);
//                            if(product instanceof Bicycle) {
//                                Bicycle bicycle = (Bicycle) product;//downcast
//                                Vehicle vehicle = bicycle; //upcast
//                            }
//                            new Shop().getProducts().add(product);
                            break;
                        case "car" :
                            //TODO
                            break;
                        case "equipment" :
                            //TODO
                            break;
                        default : System.out.println("This product type doesn't exist.");
                    }
                    break;
                case "view" :
                    //TODO
                    break;
                case "exit" :
                    System.out.println("Bye bye!");
                    System.exit(0);
                    break;
                default : System.out.println("This command doesn't exist.");
            }

        }

    }
}
