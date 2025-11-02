package if_else;
import java.util.Scanner;
public class ternuryopr {
    static void main(String[] args) {
        int x ;
        System.out.print("Enter any number :");
        Scanner sc= new Scanner(System.in);
        x= sc.nextInt();
        System.out.println((x%2==0) ? "Even " : "Odd");
    }
}
