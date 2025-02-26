import java.util.Scanner;

public class AdminCatalog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductCatalog productCatalog = ProductCatalog.getInstance();

        while(true){
            System.out.println("\nPrdouct Catalog Operations:");
            System.out.println("1. View Product Catalog");
            System.out.println("2. Add Product to Catalog");
            System.out.println("3. Delete Product from Catalog");
            System.out.println("4. Update Product in Catalog");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    productCatalog.printCatalog();
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String productName = sc.nextLine();
                    System.out.print("Enter Product Price: ");
                    double productPrice = sc.nextDouble();
                    System.out.println("Enter Product Quantity: ");
                    int productQuantity = sc.nextInt();
                    productCatalog.addProductToCatalog(productName , (float)productPrice , productQuantity);
                    break;
                case 3:
                    System.out.println("Enter Product ID to delete: ");
                    int productID = sc.nextInt();
                    productCatalog.removeProductFromCatalog(productID);
                    break;
                case 4:
                    System.out.println("Enter Product ID to update: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Choice : 1.Update Name , 2.Update Price , 3.Update Quantity: ");
                    int updateChoice = sc.nextInt();
                    switch(updateChoice){
                        case 1:
                            sc.nextLine();
                            System.out.print("Enter Product Name: ");
                            String updatedName = sc.nextLine();
                            productCatalog.updateProductName(id, updatedName);
                            break;
                        case 2:
                            System.out.print("Enter Product Price: ");
                            float updatedPrice = sc.nextFloat();
                            productCatalog.updateProductPrice(id, updatedPrice);
                            break;
                        case 3:
                            System.out.print("Enter Product Quantity: ");
                            int updatedQuantity = sc.nextInt();
                            productCatalog.updateProductQuantity(id, updatedQuantity);
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
