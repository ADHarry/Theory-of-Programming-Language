/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rms;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Ali
 */
public class MyConnection {
    
    public static final String username = "root";// put MYSQL workbench username
    public static final String password = "ALI@174782"; // MYSQL password
    public static final String url = "jdbc:mysql://localhost:3306/rms";
    public static Connection con = null;
    
    public static Connection getConnection(){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, username, password);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "" +ex, "", JOptionPane.WARNING_MESSAGE);
            }
            return con;
    }
    
}