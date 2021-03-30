package main;

import model.*;
import service.*;

import java.util.*;

public class Application {
    /*TODO Add the following use cases to the application:
    - save the notifications in a file with the name notifications.txt, in a resources/notifications folder

    - create a folder for the notifications
    create notification folder <folder name>

    - create a file for the notifications
    create notification file <filename>

    - delete the file
    delete notification file <filename>

    - view all notification files
    list <folder name>

    - view all notifications from a file
    view notifications <filename>

      */
    public static void main(String[] args) {
        Shop shop = new Shop();
        ProductService productService = new ProductService();
        NotificationService notificationService = new NotificationService();
        ShopService shopService = new ShopService(notificationService);

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Please type one of the following commands: add, view or exit");
            String line = scanner.nextLine();
            switch(line) {
                case "add" :
                    addProduct(shop, productService, shopService, scanner);
                    break;
                case "view" :
                    shopService.printProductsDetails(shop);
                    break;
                case "exit" :
                    System.out.println("Bye bye!");
                    System.exit(0);
                    break;
                default : System.out.println("This command doesn't exist.");
            }
        }
    }

    private static void addProduct(Shop shop, ProductService productService, ShopService shopService, Scanner scanner) {
        System.out.println("Please choose a product type: ");
        String productType = scanner.nextLine();
        switch(productType) {
            case "bicycle" : {
                System.out.println("Please specify the bicycle details: name/price/stock/model/limitedEdition/height");
                shopService.addProduct(shop, productService.buildBicycle(scanner.nextLine()));
                break;
            }
            case "car" : {
                System.out.println("Please specify the car details: " +
                        "name/price/stock/model/limitedEdition/color/transmission/power/numberOfCylinders");
                shopService.addProduct(shop, productService.buildCar(scanner.nextLine()));
                break;
            }
            case "equipment" : {
                System.out.println("Please specify the equipment details: name/price/stock/supplierName/supplierCountry");
                shopService.addProduct(shop, productService.buildEquipment(scanner.nextLine()));
                break;
            }
            default : System.out.println("This product type doesn't exist.");
        }
    }
}
