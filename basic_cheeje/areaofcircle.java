package basic_cheeje;

import java.util.Scanner;

public class areaofcircle {
    static void main(String[] args) {
        double r;
        double pi;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter radius :");
        r=sc.nextDouble();
        pi=3.141593;
        double area=(pi*r*r);
        System.out.print("Area is :");
        System.out.print(area) ;


    }
}
