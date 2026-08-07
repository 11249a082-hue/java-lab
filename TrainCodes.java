import java.util.Scanner;

class TrainCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] trainCodes = {"TN101", "TN102", "TN103", "TN104", "TN105"};
        try {
            System.out.print("Enter the index (0-4): ");
            int index = sc.nextInt();
            System.out.println("Train Code: " + trainCodes[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Please enter an index between 0 and 4.");
        }
        sc.close();
    }
}