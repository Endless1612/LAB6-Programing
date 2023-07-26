import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number 1 : ");
        int num1 = scanner.nextInt();

        System.out.print("Number 2 : ");
        int num2 = scanner.nextInt();

        System.out.print("Number 3 : ");
        int num3 = scanner.nextInt();

        if (num1 > num2) {
            int swap = num1;
            num1 = num2;
            num2 = swap;
        }

        if (num2 > num3) {
            int swap = num2;
            num2 = num3;
            num3 = swap;

            if (num1 > num2) {
                swap = num1;
                num1 = num2;
                num2 = swap;
            }
        }

        System.out.println("Sort is " + num1 + " " + num2 + " " + num3);

    }

}
