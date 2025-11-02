package loops;
import java.util.Scanner;
public class countdig {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n =sc.nextInt();
        int cout=0;
        while(n!=0){
            n=n/10;
            cout++;
        }
        System.out.println("Total digits are : "+cout);

    }
}
