package loops;
import java.util.Scanner;
public class ap {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of terms u want to print : ");
        int n =sc.nextInt();
        int a= 4,d=6;
        for (int i = 1; i <= n; i++) {
            System.out.print(a+" ");
            a+=d;
        }
    }
}
