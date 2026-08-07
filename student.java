class Student {
    // Data members
    String name;
    int rollNo;
    int marks;

    // Constructor
    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to calculate grade
    String calculateGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 80)
            return "B";
        else if (marks >= 70)
            return "C";
        else if (marks >= 60)
            return "D";
        else
            return "F";
    }

    // Method to display student details
    void displayInfo() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Marks        : " + marks);
        System.out.println("Grade        : " + calculateGrade());
        System.out.println("----------------------------");
    }
}
class StudentDemo {
    public static void main(String[] args) {

        // Creating two student objects
        Student s1 = new Student("Rahul", 101, 92);
        Student s2 = new Student("Priya", 102, 78);

        // Displaying student details
        s1.displayInfo();
        s2.displayInfo();
    }
}