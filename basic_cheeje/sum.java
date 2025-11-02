package basic_cheeje;

import java.util.Scanner;

public class sum
{
    static void main() {
        int x ;
        System.out.print("Enter 1 st number :");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        int y ;
        System.out.print("Enter 2nd number :");

        y=sc.nextInt();
        int z ;
        System.out.print("Enter 3rd number :");

        z=sc.nextInt();
        System.out.print("Sum is :");
        System.out.println(x+y+z);
    }
}
