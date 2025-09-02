import java.util.*;
public class Perimeter_Of_a_Rectangle {
    public static void main(String []args){
        System.out.println("input length and width");
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double per = 2 * (l+w);
        System.out.println("Perimeter" + per);

    }

}
