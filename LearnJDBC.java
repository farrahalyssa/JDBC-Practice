import java.sql.Connection;
import java.sql.DriveManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class LearnJDBC{
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/db";
        String user ="root";
        String password = "root1224";

        try{
            Connection connect = DriveManager.getConnection(url, user, password);
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM my table");

            while (rs.next()){
                System.out.println(rs.getString("column_name"));
            }
            connect.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}