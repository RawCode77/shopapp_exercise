/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Utilisateur
 */
public class ShoppApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        double tax = 0.2;
//        double total = 0.0;

        System.out.println("Welcome to Duke Choice Shop");

//        Customer c1 = new Customer();
//        //no longer complies because of constructor
//
//        c1.name = "Stinky";
//        c1.size = "S";
//
//        System.out.println("Customer is " + c1.name);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5,"S" );
        Clothing item3 = new Clothing("Green Scarf", 5.0,"S" );
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S" );

        Clothing[] items = {item1, item2, item3, item4};
        //Clothing[] items = {item1, item2};

      

        try {
            ItemList list = new ItemList(items);
            Routing routing = Routing.builder()
                    .get("/items", list).build();
            ServerConfiguration config = ServerConfiguration.builder()
                    .bindAddress(InetAddress.getLocalHost())
                    .port(8888).build();
            WebServer ws = WebServer.create(config, routing);
            ws.start();
        } catch  (UnknownHostException ex) {
            ex.printStackTrace();

        }

//        System.out.println("item 1 " + "," + item1.description + "," + item1.price + "," + item1.size);
//        System.out.println("item 2 " + "," + item2.description + "," + item2.price + "," + item2.size);
//        total = (item1.price + item2.price * 2) * (1 + tax);
        //System.out.println("Total is = " + total);
//        int measurement = 3;
//
//        switch (measurement) {
//            case 1, 2, 3:
//                c1.size = "S";
//                break;
//            case 4, 5, 6:
//                c1.size = "M";
//                break;
//            case 7, 8, 9:
//                c1.size = "L";
//                break;
//            default:
//                c1.size = "X";
//
//        }
//        for (Clothing item : items) {
//            if (c1.size.equals(item.size)) {
//                total = total + item.price;
//                System.out.println("Item: " + item.description + "," + item.price + "," + item.size);
//
//                //total = total + total * tax;
//                if (total > 15) {
//                    break;
//                }
//            }
//        }
//
//        System.out.println("Total is = " + total);

    }

}
