package loops;
import java.util.Scanner;
public class revofnum {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int copy= n;
        int revn=0;
        while(n!=0){
            revn*=10;
            revn+=n%10;

            n/=10;

        }
        System.out.println(revn);
        int sum =revn+copy;
        System.out.println(sum);

    }
}
