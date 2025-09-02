import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        double result1 = a + b * c;   // multiplication first
        double result2 = a * b + c;   // multiplication first, then addition
        double result3 = c + a / b;   // division first, then addition
        double result4 = a % b + c;   // modulo first, then addition (works with doubles too)

        System.out.println("The results of Double Operations are "
                           + result1 + ", " + result2 + ", " 
                           + result3 + ", and " + result4);
    }
}
