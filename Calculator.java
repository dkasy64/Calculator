import java.util.Scanner;
public class Calculator {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two whole numbers");
        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println(y+x);
    }
}