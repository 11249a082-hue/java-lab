import java.util.Scanner;
class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result = num1 / num2;

        System.out.println("Division = " + result);

        sc.close();
    }
}