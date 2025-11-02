package if_else;
import java.util.Scanner;
public class digitof4num {
    static void main(){
        int n ;
        System.out.print("Enter any number : ");
        Scanner ab=new Scanner(System.in);
        n = ab.nextInt();
        if(n>=1000 && n<=9999){
            System.out.println("Yes , this is 4 digit number ");
        }
        else{
            System.out.println("No , this is not 4 digit number");
        }
    }
}
