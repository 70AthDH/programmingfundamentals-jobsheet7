import java.util.Scanner;
public class cafeDoWhile02 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int coffe, bread, tea;
        String name;
        int price_total;
        int coffe_price = 12000, tea_price = 7000, bread_price = 20000;
        do {
            System.out.print("Enter customer name (type 'cancel' to exit): ");
            name = sc.nextLine();
            if (name.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction canceled.");
                break;
            }
            System.out.print("Coffee quantity: ");
            coffe = sc.nextInt();
            System.out.print("Tea quantity: ");
            tea = sc.nextInt();
            System.out.print("Bread quantity: ");
            bread = sc.nextInt();
            price_total = (coffe * coffe_price) + (tea * tea_price) + (bread * bread_price);
            System.out.println("Total amount to pay: Rp " + price_total);
            sc.nextLine();
        } while (true);
        System.out.println("All transactions completed.");
 
    }
}
