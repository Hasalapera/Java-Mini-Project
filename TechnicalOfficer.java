public class TechnicalOfficer extends User {
    private String department;

    // Constructor
    public TechnicalOfficer(String firstName, String lastName, String address, String email, String userName, String password, String profilePic, String department) {
        super(firstName, lastName, address, email, userName, password, profilePic);
        this.department = department;
    }

    // Getter and Setter for Department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "TechnicalOfficer{" + super.toString() + ", department='" + department + "'}";
    }
}
