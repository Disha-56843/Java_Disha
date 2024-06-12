package Date08_06;
//6.
//Write a Java program that accepts two floating­point numbers and checks whether they are the same up to two decimal places.
//
//Test Data
//Input first floating­point number: 1235
//Input second floating­point number: 2534
//Expected Output :
//
//These numbers are different.
   
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first floating-point number: ");
        double firstNumber = sc.nextDouble();

        System.out.print("Input second floating-point number: ");
        double secondNumber = sc.nextDouble();

        if (firstNumber == secondNumber) {
            System.out.println("These numbers are the same");
        } else {
            System.out.println("These numbers are different.");
        }
        sc.close();
    }
	
}
