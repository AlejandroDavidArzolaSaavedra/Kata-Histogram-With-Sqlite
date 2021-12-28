
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Mail;


public class MailListReaderBD {
    private final List<Mail> map = new ArrayList();

    private Connection connect() {
        String url = "jdbc:sqlite:C:\\Users\\Lab-DIS\\Documents\\NetBeansProjects\\kata5P2\\mail.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void selectAll(){
        String sql = "SELECT * FROM direcc_email";
        try (Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()) {
                map.add(new Mail(rs.getString("direccion")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public List<Mail> read(){
        return map;
    }
}
