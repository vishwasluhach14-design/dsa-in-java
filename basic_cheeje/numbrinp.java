package basic_cheeje;

import java.util.Scanner;

public class numbrinp {
    static void main() {
        int x;
        System.out.print("Enter any number :");
        Scanner sc= new Scanner(System.in);
        x= sc.nextInt();
        System.out.print("Square of Enterd number is :");
        System.out.println(x*x);
    }
}
