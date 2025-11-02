package loops;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class gp {
    static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of terms : ");
        int a=1,r=2;
        int n= sc.nextInt();
        for(int i =1;i<=n;i++){
            System.out.print(a+" ");
            a*=r;
        }
    }
}
