import java.util.Scanner;

public class Laboratory2ExerciseIndiv {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amount ;
        int total = 0;
        int cnt = 0;
        System.out.println("Enter amount (0 to stop): ");
        amount = scanner.nextInt();

        while (amount != 0) {
            total = amount + total;
            cnt++;

            System.out.println("Enter amount (0 to stop): ");
            amount = scanner.nextInt();

            System.out.println("Spent Money): " + total);
            System.out.println("Items purchased: " + cnt);
        }
    }
}
