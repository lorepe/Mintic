/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librosdb;

import java.sql.*;

/**
 *
 * @author lorep
 */
public class Conexion {

    Connection conectar = null;

    public Connection conectar() {
        try {
            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection("jdbc:sqlite:librog30.db");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conectar;
    }

}
