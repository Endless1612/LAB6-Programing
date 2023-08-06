import java.util.Scanner;

public class TimeCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter time : ");
        int time = input.nextInt();

        int remain = time;

        System.out.println(remain / 86400 + " Day");
        remain = remain %= 86400;

        System.out.println(remain / 3600 + " Hour ");
        remain = remain % 3600;

        System.out.println(remain / 60 + " sec");
        remain = remain % 60;
    }

}
