import java.util.Scanner;

public class BasicCalculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();

        float addition = num1 + num2;
        float subtraction = num1 - num2;
        float multiplication = num1 * num2;

        if (num2 != 0) {
            float division = num1 / num2;
            System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                    + num1 + " and " + num2 + " is "
                    + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        } else {
            System.out.println("Division by zero is not allowed.");
            System.out.println("The addition, subtraction, and multiplication value of 2 numbers "
                    + num1 + " and " + num2 + " is "
                    + addition + ", " + subtraction + ", and " + multiplication);
        }
    }
}
