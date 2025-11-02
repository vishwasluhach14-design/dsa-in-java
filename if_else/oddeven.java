package if_else;
import java.util.Scanner;

public class oddeven {
    static void main() {
        int x ;
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        if(x%2==0){
            System.out.println("EVEN ");
        }
        else{
            System.out.println("Odd !!!");
        }
    }
}
