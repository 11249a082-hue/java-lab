import java.util.Scanner;

class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Length
        System.out.println("Length: " + str.length());

        // Uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Character at index 2
        if (str.length() > 2) {
            System.out.println("Character at index 2: " + str.charAt(2));
        }

        // Substring
        if (str.length() >= 5) {
            System.out.println("Substring (0 to 5): " + str.substring(0, 5));
        }

        // Replace
        System.out.println("Replace 'a' with '@': " + str.replace('a', '@'));

        // Contains
        if (str.contains("Java")) {
            System.out.println("The string contains 'Java'.");
        } else {
            System.out.println("The string does not contain 'Java'.");
        }

        sc.close();
    }
}