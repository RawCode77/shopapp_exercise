/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author Utilisateur
 */
public class Clothing {

     String description;
     double price;
     String size;

    private final double MIN_PRICE = 10.0;
    private final double MIN_TAX = 0.2;

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price * MIN_TAX);
    }

    public void setPrice(double price) {
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
public String toString() {
    return "Clothing{" +
            "description='" + description + '\'' +
            ", price=" + price +
            ", size='" + size + '\'' +
            '}';
}

//    @Override
//    public String toString() {
//        return "Clothing{" + "description=" + description + ", price=" + price + ", size=" + size + '}';
//    }






}


