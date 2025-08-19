import java.util.*;
public class Power_Calculation {
    public static void main(String []args){
        System.out.println("input base and exponent");
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        double ex = sc.nextDouble();
        double RES = Math.pow(b,ex);
        System.out.println("RESULT: " + RES);

    }
}
