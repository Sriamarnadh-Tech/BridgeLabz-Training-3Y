import java.util.*;
public class Calculate_Average_of_Three_Numbers {
    public static void main(String []args){
        System.out.println("input 3 no:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double aver = (a+b+c)/3;
        System.out.println(aver);
    }
}
