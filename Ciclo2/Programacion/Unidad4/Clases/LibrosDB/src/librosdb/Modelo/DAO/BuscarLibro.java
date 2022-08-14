/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librosdb.Modelo.DAO;

import librosdb.Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lorep
 */
public class BuscarLibro {
    public void buscar (int isbn){
        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            Statement st = cn.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM libro WHERE ISBN='"+isbn+"'");
            if(rs.next()){
                System.out.println("------------------------------");
                System.out.println("ISBN: "+rs.getInt(1));
                System.out.println("Título: "+rs.getString(2));
                System.out.println("Año: "+rs.getInt(3));
                System.out.println("------------------------------");
                rs.close();
            }else{
                System.out.println("No existe un libro con ese ISBN");
            }
            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
