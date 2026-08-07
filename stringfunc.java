import java.util.Scanner;

class EmployeeDepartment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input employee names
        System.out.print("Enter first employee name: ");
        String emp1 = sc.nextLine();

        System.out.print("Enter second employee name: ");
        String emp2 = sc.nextLine();

        // Compare names using equalsIgnoreCase()
        if (emp1.equalsIgnoreCase(emp2)) {
            System.out.println("Both names are the same.");
            System.out.println("Employees are working in the same department.");
        } else {
            System.out.println("Names are different.");
            System.out.println("Employees may be working in different departments.");
        }

        sc.close();
    }
}