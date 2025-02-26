import java.util.HashMap;
import java.io.*;

public class ProductCatalog {
    private static ProductCatalog instance = null;
    public  HashMap<Integer, Product> productCatalog = new HashMap<>();
    private static int id = 1;

    public ProductCatalog(){
        // Predefined products
        productCatalog.put(id , new Product(id , "Pepsodent Toothbrush" , 39.99f  , 100));
        productCatalog.put(id+1 , new Product(id+1 , "Tata Salt" , 10.50f , 100));
        productCatalog.put(id+2 , new Product(id+2 , "Amul Butter" , 48.00f, 100 ));
        productCatalog.put(id+3 , new Product(id+3 , "Aashirvaad Atta" , 275.00f , 100));
        productCatalog.put(id+4 , new Product(id+4 , "Britannia Biscuit" , 20.00f , 100));
        productCatalog.put(id+5 , new Product(id+5 , "Maggi Noodles" , 12.99f , 100));
        productCatalog.put(id+6 , new Product(id+6 , "Kissan Ketchup" , 55.99f , 100));
        productCatalog.put(id+7 , new Product(id+7 , "Nescafé Coffee" , 185.00f , 100));
        productCatalog.put(id+8 , new Product(id+8 , "Bovonto Soft Drink" , 35.50f , 100));
        productCatalog.put(id+9 , new Product(id+9 , "Harpic Toilet Cleaner" , 45.00f, 100 ));
        productCatalog.put(id+10 , new Product(id+10 , "Dove Soap" , 40.00f , 100));
        productCatalog.put(id+11 , new Product(id+11 , "Surf Excel Detergent" , 90.00f , 100));
        productCatalog.put(id+12 , new Product(id+12 , "Cadbury Dairy Milk" , 150.00f , 100));
        productCatalog.put(id+13 , new Product(id+13 , "Lays Chips" , 20.00f , 100));
        productCatalog.put(id+14 , new Product(id+14 , "Tata Tea" , 75.00f , 100));
        productCatalog.put(id+15 , new Product(id+15 , "Hershey’s Syrup" , 250.00f , 100));
        productCatalog.put(id+16 , new Product(id+16 , "Fanta Soft Drink" , 30.00f , 100));
        productCatalog.put(id+17 , new Product(id+17 , "Britannia Cake" , 45.00f , 100));
        productCatalog.put(id+18 , new Product(id+18 , "Ariel Powder" , 180.00f , 100));
        productCatalog.put(id+19 , new Product(id+19 , "Nivea Cream" , 40.00f , 100));
        productCatalog.put(id+20 , new Product(id+20 , "Patanjali Dant Kanti" , 70.00f , 100));
        productCatalog.put(id+21 , new Product(id+21 , "Nestle Milk" , 50.00f , 100));
        productCatalog.put(id+22 , new Product(id+22 , "Saffola Cooking Oil" , 200.00f , 100));
        productCatalog.put(id+23 , new Product(id+23 , "Borges Olive Oil" , 550.00f , 100));
        productCatalog.put(id+24 , new Product(id+24 , "Pepsi Soft Drink" , 40.00f , 100));
        productCatalog.put(id+25 , new Product(id+25 , "Red Label Tea" , 150.00f , 100));
        productCatalog.put(id+26 , new Product(id+26 , "Pillsbury Cake Mix" , 160.00f , 100));
        productCatalog.put(id+27 , new Product(id+27 , "Cadbury Bournvita" , 120.00f , 100));
        productCatalog.put(id+28 , new Product(id+28 , "Quaker Oats" , 175.00f , 100));
        productCatalog.put(id+29 , new Product(id+29 , "Rin Detergent Powder" , 80.00f , 100));
        productCatalog.put(id+30 , new Product(id+30 , "Del Monte Pasta" , 90.00f , 100));
        productCatalog.put(id+31 , new Product(id+31 , "Tata Sky Instant Noodles" , 15.00f , 100));
        productCatalog.put(id+32 , new Product(id+32 , "Amul Cheese" , 95.00f , 100));
        productCatalog.put(id+33 , new Product(id+33 , "MTR Sambar Mix" , 120.00f , 100));
        productCatalog.put(id+34 , new Product(id+34 , "Gits Gulab Jamun Mix" , 110.00f , 100));
        productCatalog.put(id+35 , new Product(id+35 , "Shakti Bhog Atta" , 210.00f , 100));
        productCatalog.put(id+36 , new Product(id+36 , "Sundrop Peanut Butter" , 180.00f , 100));
        productCatalog.put(id+37 , new Product(id+37 , "Bikanervala Sweets" , 250.00f , 100));
        productCatalog.put(id+38 , new Product(id+38 , "Fruits & Roots Apple Cider Vinegar" , 180.00f , 100));
        productCatalog.put(id+39 , new Product(id+39 , "Tata Sampann Toor Dal" , 100.00f , 100));
        productCatalog.put(id+40 , new Product(id+40 , "Jockey Underwear" , 299.00f , 100));
        productCatalog.put(id+41 , new Product(id+41 , "Kellogg's Cornflakes" , 240.00f , 100));
        productCatalog.put(id+42 , new Product(id+42 , "Amul Ice Cream" , 65.00f , 100));
        productCatalog.put(id+43 , new Product(id+43 , "Maggi Pasta" , 30.00f , 100));
        productCatalog.put(id+44 , new Product(id+44 , "Mother Dairy Curd" , 55.00f , 100));
        productCatalog.put(id+45 , new Product(id+45 , "Nescafé Classic Coffee" , 180.00f , 100));
        productCatalog.put(id+46 , new Product(id+46 , "Haldiram's Snacks" , 200.00f , 100));
        productCatalog.put(id+47 , new Product(id+47 , "Vicks VapoRub" , 75.00f , 100));
        productCatalog.put(id+48 , new Product(id+48 , "Sunsilk Shampoo" , 150.00f , 100));
        productCatalog.put(id+49 , new Product(id+49 , "Dove Conditioner" , 180.00f , 100));
        id = id+49;
    }


    //get instance
    //singleton class
    public static ProductCatalog getInstance(){
        if(instance == null){
            instance = new ProductCatalog();
        }
        return instance;
    }

    //setter
    public void addProductToCatalog(String name , float price , int quantity) {
        productCatalog.put(id+1 , new Product(id+1 , name , price , quantity));
        System.out.println("Product added to Catalog");
        id += 1;
        System.out.println("---------------------------------------------------------------------------------");
    }

    public void removeProductFromCatalog(int id) {
        try{
            productCatalog.remove(id);
            System.out.println("Product deleted from Catalog");
            System.out.println("---------------------------------------------------------------------------------");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void updateProductName(int id , String name) {
        try{
            Product p = productCatalog.get(id);
            p.changeName(name);
            System.out.println("Product name updated");
            System.out.println("---------------------------------------------------------------------------------");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void updateProductPrice(int id , float price) {
        try{
            Product p = productCatalog.get(id);
            p.changePrice(price);
            System.out.println("Product price updated");
            System.out.println("---------------------------------------------------------------------------------");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void updateProductQuantity(int id , int quantity) {
        try{
            Product p = productCatalog.get(id);
            p.changeQuantity(quantity);
            System.out.println("Product quantity updated");
            System.out.println("---------------------------------------------------------------------------------");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void printCatalog() {
        for(Product p : productCatalog.values()) {
            Product.printProduct(p);
        }
        System.out.println("---------------------------------------------------------------------------------");
    }
}
