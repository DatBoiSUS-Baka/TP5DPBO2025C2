import javax.xml.crypto.Data;
import java.sql.*;

public class Database {
    private Connection connection;

    private Statement statement;

    // Constructor
    public Database(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_mahasiswa_dpbo", "root", "");
            statement = connection.createStatement();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    // Select
    public ResultSet selectQuery(String sql){
        try{
            statement.executeQuery(sql);
            return statement.getResultSet();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // INSERT, UPDATE, DELETE
    public int insertUpdateDeleteQuery(String sql){
        try {
            return statement.executeUpdate(sql);
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    // Getter
    public Statement getStatement(){
        return statement;
    }

    public Connection getConnection(){
        return connection;
    }
}
