class Employee {
    int employeeId;
    String name;
    double basicSalary;

    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }

    public static void main(String[] args) {
        PermanentEmployee emp =
            new PermanentEmployee(101, "Rahul", 30000, 5000, 3000);

        emp.displayDetails();
    }
}

class PermanentEmployee extends Employee {
    double HRA;
    double DA;

    PermanentEmployee(int employeeId, String name, double basicSalary,
                      double HRA, double DA) {
        super(employeeId, name, basicSalary);
        this.HRA = HRA;
        this.DA = DA;
    }

    double calculateGrossSalary() {
        return basicSalary + HRA + DA;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("HRA: " + HRA);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}
