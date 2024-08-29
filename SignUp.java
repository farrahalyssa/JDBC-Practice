import java.util.Scanner;



public class SignUp{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println('Enter name: ');
        String name = scan.next();

        System.out.println("Enter username: ");
        String username = scan.next();

        System.out.println("Enter email: ");
        String email = scan.next();

        System.out.println("Enter password: ");
        String password = scan.next();

        // Create a new User object
        User user = new User();
        user.setUsername(name);
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password); // Set password

        // Add new user to the database
        UserDAO userDAO = new UserDAO();
        userDAO.addUser(user);

        // Optionally, print all users to confirm
        System.out.println("Users in the database:");

        List<User> users = userDAO.getAllUsers();
        for (User u : users) {
            System.out.println(u.getUsername() + " - " + u.getEmail());
        }

        // Close the scanner
        scan.close();
    }

}