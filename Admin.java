public class Admin extends User {
    // Constructor
    public Admin(String firstName, String lastName, String address, String email, String userName, String password, String profilePic) {
        super(firstName, lastName, address, email, userName, password, profilePic);
    }

    @Override
    public String toString() {
        return "Admin{" + super.toString() + "}";
    }
}

