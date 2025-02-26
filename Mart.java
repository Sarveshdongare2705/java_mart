import java.lang.reflect.Array;
import java.util.*;
public class Mart{
    ProductCatalog p = ProductCatalog.getInstance();

    private HashMap<Integer , MyCartProduct> myCart = new HashMap<>();

    public Mart() {
    }

    public void showProductCatalog(){
        System.out.println("Product catalog : ");
        for(Product p : p.productCatalog.values()){
            p.printProduct(p);
        }
    }

    public Product getProduct(int id){
        return p.productCatalog.get(id);
    }

    public void addProduct(Product p , int quantity){
        myCart.put(p.id , new MyCartProduct(p , quantity));
    }

    public void removeProduct(int id){
        try{
            if(myCart.containsKey(id)){
                myCart.remove(id);
            }
            else{
                System.out.println("Product not found");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void showMyCart(){
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Your Cart : ");
        for(MyCartProduct p : myCart.values()){
            p.printMyCartProduct(p);
        }
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Total Billing Amount : "+ MyCartProduct.getTotalAmount());

        System.out.println("\n GST Percentage----("+MyCartProduct.gst +")----");
        System.out.println("CGST : "+MyCartProduct.getGstVal()/2);
        System.out.println("SGST : "+MyCartProduct.getGstVal()/2);
        System.out.println("Total GST : "+MyCartProduct.getGstVal());
        float total = MyCartProduct.getGstVal() + MyCartProduct.getTotalAmount();
        System.out.println("Total Amount : "+total);
        System.out.println("---------------------------------------------------------------------------------");
    }

    public void updateProduct(int id , int quantity){
        try {
            if (myCart.containsKey(id)) {
                MyCartProduct p = myCart.get(id);
                p.updateQuantity(quantity);
            }
            else{
                System.out.println("Product not found");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }



}