import java.util.Scanner;
public class Calculator {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two whole numbers");
        double x = scan.nextInt();
        double y = scan.nextInt();
        
        System.out.println("Type 1 to perform addition\nType 2 to perform subtraction\nType 3 to perform multiplication\nType 4 to perform division");
        double operation = scan.nextInt();
        
        if(y == 0 && operation == 4) {
            System.out.println("Error: Divide by Zero");
        } else if(operation == 1){
            System.out.println(x+y);
        } else if(operation == 2) {
            System.out.println(x-y);
        } else if(operation == 3) {
            System.out.println(x*y);
        } else if(operation == 4) {
            System.out.println(x/y);
        }

    }
}