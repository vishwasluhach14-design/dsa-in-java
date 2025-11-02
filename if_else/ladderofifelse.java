package if_else;
import java.util.Scanner;
public class ladderofifelse {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number : ");
        double n = sc.nextDouble();
        if(n%3==0 && n%5==0){
            System.out.println("Divisible by 3 and 5 ");
        }
        else{
            if(n%3==0){
                System.out.println("Divisible by 3 but not 5");
            }else{
                if(n%5==0){
                    System.out.println("Divisible by 5 but not 3");
                }else{
                    System.out.println("Not divisible by 5 and 3 ");
                }

            }
        }

    }
}
