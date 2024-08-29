import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO{
    public void addUser(User user){
        String sql = 'INSERT INTO users (name, username, email, password) VALUES (?,?,?,?)';

        try(
           Connection connect = DatabaseUtils.getConnection();
           PreparedStatement statement = connect.prepareStatement(sql){
            statement.setString(1, user.getName);
            statement.setString(2, user.getUsername);
            statement.setString(3, user.getEmail);
            statement.setString(4, user.getPassword);

           } 
        )
        catch(Exception e){
            e.printStackTrace();
        }
    }
(
    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        String sql = 'SELECT * FROM users';


        try(
            Connection connect = DatabaseUtils.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password")); // Retrieve password
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
        
    }
}