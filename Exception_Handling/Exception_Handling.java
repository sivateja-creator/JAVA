package Exception_Handling;
import java.util.*;
public class Exception_Handling {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = get.nextInt();
        System.out.print("Enter second number: ");
        int num2 = get.nextInt();
        try {
            System.out.println("The division of numbers is: " + (num1 / num2));
        }
        catch (ArithmeticException e) {
            System.out.println("No number should be divided by zero");
        }
        finally {
            System.out.println("Program Executed Successfully");
        }

        get.close();
    }
}