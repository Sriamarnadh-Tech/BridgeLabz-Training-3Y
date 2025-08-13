import java.util.*;
public class Area_of_a_Circle {
    public static void main(String []args){
        System.out.println("Give the radius");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double AREA = 3.14*(n * n);
        System.out.println("AREA: " + AREA);

    }
}
