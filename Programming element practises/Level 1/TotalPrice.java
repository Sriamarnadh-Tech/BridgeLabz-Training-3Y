import java.util.*;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit price of the item: ");
        double price = sc.nextDouble();
        System.out.print("Enter the quantity of the item: ");
        int quantity = sc.nextInt();
        double totalPrice = price * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + price);
    }
}
