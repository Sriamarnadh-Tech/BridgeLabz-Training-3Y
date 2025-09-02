import java.util.*;
public class Volume_of_a_Cylinder {
    public static void main(String []args){
        System.out.println("Give the radius");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println("Give tje height");
        double h = sc.nextDouble();
        double VOL = 3.14*(n*n)*h;
        System.out.println("Volume:" +  VOL);

    }
}
