/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package togakade;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Inham
 */
public class Togakade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/companydb", "root","123456789");
            System.out.println(connection);
            String sql = "SELECT * FROM employee";
        } catch (SQLException ex) {
            Logger.getLogger(Togakade.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }

}
