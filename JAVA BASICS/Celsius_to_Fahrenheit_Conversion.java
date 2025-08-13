import java.util.*;
public class Celsius_to_Fahrenheit_Conversion {
    public static void main(String []args){
        System.out.println("Give temp in celsius");
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int FAR = (C * (9/5)) + 32;
        System.out.println("Fahrenheit:" + FAR);
    }
}
