package loops;
import java.util.Scanner;
public class numbernto1 {
    static void main(){
        System.out.print("Enter any number : ");
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        for(int i =n ;i>0;i--){
            System.out.print(i+" ");
        }
    }
}
