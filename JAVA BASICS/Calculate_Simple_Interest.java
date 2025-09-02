import java.util.*;
public class Calculate_Simple_Interest {
    public static void main(String []args){
        System.out.println("Input the Principle,Rate and Time");
        Scanner sc = new Scanner(System.in);
        double PRIN = sc.nextDouble();
        double RATE = sc.nextDouble();
        double TIME = sc.nextDouble();
        double SIM_INT = (PRIN * RATE * TIME) / 100;
        System.out.println("Simple Interest: " + SIM_INT);

    }
}
