import java.io.Serializable;

public class Product implements Serializable {
    int id;
    String name;
    float price;
    private int quantity;

    public Product(int id , String name , float price , int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static void printProduct(Product p) {
        System.out.println(String.format("%-10d %-60s %-10.2f %-10d", p.id, p.name, p.price , p.quantity));
    }


    public void changeName(String name){
        this.name = name;
    }
    public void changePrice(float price){
        this.price = price;
    }
    public void changeQuantity(int quantity){
        this.quantity = quantity;
    }


}