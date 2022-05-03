/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ohiob
 */

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

public class javaconnect {
    Connection con;
    
    public static  Connection ConnectionDb(){
        try{
            DriverManager.registerDriver(new org.sqlite.JDBC());
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ohiob\\Documents\\NetBeansProjects\\Library Managment System\\LibraryNew.db");
            return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
