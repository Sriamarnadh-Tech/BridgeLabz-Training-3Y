import java.util.*;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceFeet = sc.nextDouble();
        double distanceYards = distanceFeet / 3.0;
        double distanceMiles = distanceYards / 1760.0;
        System.out.println("The distance in feet is " + distanceFeet +
                           ", in yards is " + distanceYards +
                           ", and in miles is " + distanceMiles);
    }
}
