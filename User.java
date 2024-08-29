public class User {
    // Private instance variables
    private String username;
    private String name;
    private String password;
    private String email;

    // Constructor
    public User(String username, String name, String password, String email) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    // Getter for username
    public String getUsername() {
        return this.username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for name
    public String getName() {
        return this.name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for email
    public String getEmail() {
        return this.email;
    }

    // Setter for email with validation
    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email address.");
        }
    }

    // Getter for password
    public String getPassword() {
        return this.password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }
}