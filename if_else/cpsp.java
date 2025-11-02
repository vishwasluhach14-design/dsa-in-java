package if_else;
import java.util.Scanner;
public class cpsp {
    static void main() {
        double cp , sp;
        System.out.print("Enter Cost Price : ");
        Scanner sc= new Scanner(System.in);
        cp = sc.nextDouble();
        System.out.print("Enter Selling price :");
        sp =sc.nextDouble();
        if(cp>sp){
            System.out.print("Loss by : ");
            System.out.println(cp-sp);
        }else if (sp>cp) {
            System.out.print("Profit by : ");
            System.out.println(sp-cp);
        }else{
            System.out.println("No Profit , No Loss ");
        }
    }
}
