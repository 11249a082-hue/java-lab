import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            String input = sc.nextLine();

            int age = Integer.parseInt(input);
            System.out.println("Age: " + age);

            int result = age / (age - age);
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid age input.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        }

        sc.close();
    }
}