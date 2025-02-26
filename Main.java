import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Mart obj = new Mart();
         while (true) {
            System.out.println("\nMart System Operations:");
            System.out.println("1. View Product Catalog");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. Delete Product from Cart");
            System.out.println("4. Show My Cart");
            System.out.println("5. Update a Product");
            System.out.print("Enter your choice: ");


            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    obj.showProductCatalog();
                    break;
                case 2:
                    System.out.println("Enter product id");
                    int addId = scanner.nextInt();
                    System.out.println("Enter quantity");
                    int quantity = scanner.nextInt();
                    obj.addProduct(obj.getProduct(addId), quantity);
                    break;
                case 3:
                    System.out.println("Enter product id to delete");
                    int delId = scanner.nextInt();
                    obj.removeProduct(delId);
                    break;
                case 4:
                    obj.showMyCart();
                    break;
                case 5:
                    System.out.println("Enter product id to update");
                    int updateId = scanner.nextInt();
                    System.out.println("Enter revised quantity");
                    int updateQ = scanner.nextInt();
                    obj.updateProduct(updateId , updateQ);
                    break;
            }
        }
    }
}