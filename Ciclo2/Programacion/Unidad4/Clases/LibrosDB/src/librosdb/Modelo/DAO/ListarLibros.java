/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librosdb.Modelo.DAO;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import librosdb.Conexion;

/**
 *
 * @author lorep
 */
public class ListarLibros {
    public void listar(){
        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            Statement st = cn.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM libro");
            while(rs.next()){
                System.out.println("------------------------------");
                System.out.println("ISBN: "+rs.getInt(1));
                System.out.println("Título: "+rs.getString(2));
                System.out.println("Año: "+rs.getInt(3));
                System.out.println("------------------------------");
                
            }
            rs.close();
            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ListarLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
