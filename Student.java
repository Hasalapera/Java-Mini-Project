public class Student extends User {
    private double gpa;

    // Constructor
    public Student(String firstName, String lastName, String address, String email, String userName, String password, String profilePic, double gpa) {
        super(firstName, lastName, address, email, userName, password, profilePic);
        this.gpa = gpa;
    }

    // Getter and Setter for GPA
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() + ", gpa=" + gpa + "}";
    }
}
