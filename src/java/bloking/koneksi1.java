/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java.bloking;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author bagus
 */
public class koneksi1 {
    Connection koneksi1 = null;

    public static Connection koneksiDb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi1
                    = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");
            return koneksi1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
