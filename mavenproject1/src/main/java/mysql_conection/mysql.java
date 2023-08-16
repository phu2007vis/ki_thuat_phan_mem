
package mysql_conection;
import entity.User;
import entity.transaction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysql {
    static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    static String dbUrl = "jdbc:mysql://localhost:3306/phuoc";
    static String username = "root";
    static String password = "phuocvip1";
    public Connection connection;  
    
    public mysql() throws ClassNotFoundException, SQLException {
        Class.forName(jdbcDriver);
        this.connection = DriverManager.getConnection(dbUrl, username, password);
    }

    public void insertUser(User user) throws Exception, SQLException{
        
        String statement = "INSERT INTO `member` (`id`, `userName`, `passWord`, `name`, `privilege_Id`,`gioi_han`) VALUES (?, ?, ?, ?, ?,?)";
        
        PreparedStatement preparedStatement = connection.prepareStatement(statement);
        preparedStatement.setInt(1, user.getId());
        preparedStatement.setString(2, user.getUserName());
        preparedStatement.setString(3, user.getPassWord());
        preparedStatement.setString(4, user.getName());
        preparedStatement.setInt(5, user.getPrivilegeId());
        preparedStatement.setInt(6, user.muc_canh_bao);
        
        preparedStatement.executeUpdate();
                
    }
    public void insertTransaction(transaction tran) throws SQLException{
        
        String statement = "INSERT INTO `transaction` (`transactionid`, `money`, `timeDisplay`, `content`, `Member_Id`) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(statement);
        preparedStatement.setInt(1, tran.getId());
        preparedStatement.setInt(2, tran.getMoney());
        preparedStatement.setString(3, tran.getTimeDisplay());
        preparedStatement.setString(4, tran.getContent());
        preparedStatement.setInt(5, tran.getMemberId());

        preparedStatement.executeUpdate();
        
    }
  
    public void updateMember(User user) throws SQLException{
        String statement = "UPDATE `phuoc`.`member` SET `userName` = ?, `passWord` = ?, `name` = ?, `privilege_Id` = ?, `gioi_han` = ? WHERE (`id` = ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(statement);
        
        preparedStatement.setString(1, user.getUserName());
        preparedStatement.setString(2, user.getPassWord());
        preparedStatement.setString(3, user.getName());
        preparedStatement.setInt(4, user.getPrivilegeId());
        preparedStatement.setInt(5, user.muc_canh_bao);
        preparedStatement.setInt(6, user.getId());
        
        preparedStatement.executeUpdate();
    }
}

