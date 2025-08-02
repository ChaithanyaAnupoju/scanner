import java.util.Scanner;

public class denominations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total amount: ");
        int amount = sc.nextInt();
        int thousands = amount / 1000;
        amount = amount % 1000;
        int fiveHundreds = amount / 500;
        amount = amount % 500;
        int remaining = amount;
        System.out.println("1000s: " + thousands);
        System.out.println("500s: " + fiveHundreds);
        System.out.println("Remaining: " + remaining);
    }
}