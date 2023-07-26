import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Angle : ");
        double angle = input.nextDouble();

        if (angle == 0 || angle == 90 || angle == 180 || angle == 270) {
            System.out.println(" Lies on an axis !!");
        }
        if (angle > 0 && angle < 90) {
            System.out.println("Quadrant reside in I ");
        }
        if (angle > 90 && angle < 180) {
            System.out.println("Quadrant reside in II ");
        }
        if (angle > 180 && angle < 270) {
            System.out.println("Quadrant reside in III ");
        }
        if (angle > 270 && angle < 360) {
            System.out.println("Quadrant reside in  IV ");
        }

    }

}
