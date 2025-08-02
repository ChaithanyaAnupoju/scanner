import java.util.Scanner; 
public class perimeter{ 
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the length of the square : "); 
        int peri = sc.nextInt(); 
        System.out.println("The perimeter of the square is : "+(4*peri)); 
    } 
} 