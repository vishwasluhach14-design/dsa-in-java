package if_else;
import java.util.Scanner;
public class divby5 {
    static void main(){
        System.out.print("Enter any number : ");
        Scanner sr=new Scanner(System.in);
        int x =sr.nextInt();
        if(x % 5 == 0) {
            System.out.println("Yes divisible by 5");
        }

        else{
        System.out.println("No , Not divisible by 5 ");
        }


    }
}
