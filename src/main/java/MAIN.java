import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MAIN {
    public static void main(String[] args) {
        try {
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","user", "1234");
            Statement data = conect.createStatement();
            data.execute("insert into animal(name,age) value('Murzik', 4)");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
