package if_else;
import java.util.Scanner;
public class maggrt69 {
    static void main(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        if(n<0) n=-n;
        if(n<=69) System.out.println("Yes magnitude is smaller than 69");
        else System.out.println("No , Magnitude is not smaller than 69");

    }
}
