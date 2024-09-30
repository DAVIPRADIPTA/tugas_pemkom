/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
/**
 *
 * @author asus
 */
public class koneksi {
    private String url="jdbc:mysql://localhost/db_kasir";
    private String username_laragon = "root";
    private String password_laragon = "";
    private Connection con;
    
    public void connect(){
        try {
            con = DriverManager.getConnection(url,username_laragon,password_laragon);
            System.out.println("koneksi database berhasil");
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, e.getMessage());
        }
    }
    
    public Connection getCon(){
        return con;
    }
    
}
