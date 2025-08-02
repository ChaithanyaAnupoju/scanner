import java.util.Scanner;
public class convert{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter total seconds: ");
int totalSeconds = input.nextInt();
int hours, minutes, seconds;
hours = totalSeconds / 3600;
int remainingSeconds = totalSeconds - (hours * 3600);
minutes = remainingSeconds / 60;
seconds = remainingSeconds - (minutes * 60);
System.out.println("Hours: " + hours);
System.out.println("Minutes: " + minutes);
System.out.println("Seconds: " + seconds);
}
}
