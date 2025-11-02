package if_else;
import java.util.Scanner;
public class checkint {
    static void main() {
        System.out.print("Enter any number :");
        Scanner br=new Scanner(System.in);
        double x= br.nextDouble();
        int n =(int)x;
        if(x-n>0) System.out.println("Not an Integer");
        else{
            System.out.println("Yes , It is Integer");
        }
        }
    }