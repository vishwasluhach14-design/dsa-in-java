package if_else;
import java.util.Scanner;
public class sidoftriangle {
    static void main(String[] args ){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Sides of traingle : ");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        if(a+b > c && b+c > a && a+c > b) System.out.println("Yes They are sides of traingle");
        else System.out.println("No They r not sides of triangle");
    }
}
