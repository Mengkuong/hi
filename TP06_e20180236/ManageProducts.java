import java.util.ArrayList;
import java.util.Scanner;
 
public class ManageProducts {
    ArrayList<Product> products = new ArrayList<>();
 
    public void listAll() {
     
        System.out.printf("\tNo.    Name     Price    Instock\n"+
                          "\t________________________________\n");

        for(int i=0 ; i<products.size() ; i++){
            System.out.print("\t"+products.get(i).getNo()+"\t"+products.get(i).getName()+"\t"+products.get(i).getPrice()+"\t"+products.get(i).getAmountInStock()+"\n");
        }
        System.out.print("\n");
        
        
    }
 
    private Product inputProduct(Product p) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input product number: ");
        p.setNo(Integer.parseInt(sc.nextLine()));
 
        System.out.print("Input product name: ");
        p.setName(sc.nextLine());
 
        System.out.print("Input product price: ");
        p.setPrice(Double.parseDouble(sc.nextLine()));
 
        System.out.print("Input amount in stock: ");
        p.setAmountInStock(Integer.parseInt(sc.nextLine()));
        
        return p;
    }
 
    public void addNewProduct() {
        addNewProduct(inputProduct(new Product()));
    }
 
    public void addNewProduct(Product product) {
        // check unique product number...
        products.add(product);
    }
 
    public void removeProductByIndex(int index) {
        if (index < 0 || index >= products.size()) {
            System.err.println("ERROR: index out of range.");
        } else {
            products.remove(index);
        }
    }
 
    public void updateProduct() {
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input index to update: ");
        index = Integer.parseInt(sc.nextLine());
        if (index < 0 || index >= products.size()) {
            System.err.println("ERROR: index out of range.");
        } else {
            inputProduct(products.get(index));
        }
 
    }
 
    public int menu() {
        int opt;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("""
                    1. List all products
                    2. Add new product to the list
                    3. Remove product from list by index
                    4. Update product in list
                    5. Exit program
                    Choose an option:
                            """);
            opt = Integer.parseInt(sc.nextLine());
        } while (opt < 1 || opt > 5);

        return opt;
    }
 
    public static void main(String[] args) {
        ManageProducts mp = new ManageProducts();
        Scanner sc = new Scanner(System.in);
        int opt;
        do {
            opt = mp.menu();
            switch (opt) {
                case 1:
                    mp.listAll();
                    break;
                case 2:
                    mp.addNewProduct();
                    break;
                case 3:
                    System.out.print("Input index to remove: ");
                    mp.removeProductByIndex(Integer.parseInt(sc.nextLine()));
                    break;
                case 4:
                    mp.updateProduct();
                    break;
                case 5:
                    System.out.println("Bye!");
            }
        } while (opt != 5);

       
    }
}