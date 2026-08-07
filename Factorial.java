import java.io.*;
import java.util.*;
class Factorial 
{
public static void main(String args[]) 
{
Scanner s= new Scanner(System.in);
System.out.print("Enter a number: ");
int num = s.nextInt();
long factorial = 1;

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        }
    }
}