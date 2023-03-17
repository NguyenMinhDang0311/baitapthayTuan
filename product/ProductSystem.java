package product;
import product.Product;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CustomException extends Exception {
    private static final long serialVersionUID = 1L;

    public CustomException(String str) {
        super();
        System.out.println(str);

    }
}
public class ProductSystem {
    public static Map<Integer, Product> map = new HashMap<>();

    public static void addProduct(String name, int id, int price, String describe){
        Product emp = new Product(name, describe, price, id);
        map.put(id, emp);
    }
    public static void deleteProduct(int EmpId) throws CustomException {
        if (map.containsKey(EmpId)) {
            map.remove(EmpId);
            System.out.println("Successfully Delete form the List !!");
        }else  {
            throw new CustomException("Not Found Exception");
        }

    }
    public static void searchProduct(int EmpId) throws CustomException {
        if (map.containsKey(EmpId)) {
            // map.get(EmpId);
            System.out.println(("Product Details : - " + map.get(EmpId)));
        }else {
            throw new CustomException(("Not Found Exception"));

        }
    }
    public static void Product() {
        System.out.println(map.toString());
    }
    public static void operation() {
        System.out.println("\n***** Product management system ****");
        System.out.println("1. Add Product");
        System.out.println("2. Delete Product");
        System.out.println("3. Search Product");
        System.out.println("4. Product List");

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if (userInput == 1) {
            System.out.println("enter product details(Name, id, price,describe ");
            Scanner scanner1 = new Scanner(System.in);

            String name = scanner1.next();
            int id = scanner1.nextInt();
            int price = scanner1.nextInt();

        } else if (userInput == 2) {
            System.out.println("enter product Id");
            Scanner scanner2 = new Scanner(System.in);
            int EmpId = scanner2.nextInt();
        } else if (userInput == 3) {
            System.out.println("enter product Id");
            Scanner scanner3 = new Scanner(System.in);
            int EmpId = scanner3.nextInt();
        }

    }
}