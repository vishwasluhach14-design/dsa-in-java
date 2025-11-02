package loops;
import java.util.Scanner;
public class patrn1n2n1 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of terms : ");
        int n =sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.print(i+" ");
            System.out.print(n+1-i+" ");

        }
    }
}
