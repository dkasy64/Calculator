import java.util.Scanner;
public class Calculator {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two whole numbers");
        int x = scan.nextInt();
        int y = scan.nextInt();
        
        System.out.println("Type 1 to perform addition\nType 2 to perform subtraction");
        int operation = scan.nextInt();
        
        if(operation == 1){
            System.out.println(x+y);
        } else if(operation == 2) {
            System.out.println(x-y);
        }

    }
}