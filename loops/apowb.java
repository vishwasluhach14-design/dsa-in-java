package loops;
import java.util.Scanner;
public class apowb {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter base value :");
        int a =sc.nextInt();
        System.out.print("Enter "+a+" raised to power : ");
        int b =sc.nextInt();
        int pow=1;
        for(int i =1;i<=b;i++){
            pow *=a;

        }
        System.out.println(pow);


    }
}
