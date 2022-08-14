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
public class ConsultarUnidades {
    public void consultarU(int isbn){
        
        try {
            Conexion cc = new Conexion();
            Connection cn= cc.conectar();
            
            Statement st= cn.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM inventario WHERE ISBN='"+isbn+"'");
            
            if(rs.next()){
                System.out.println("-----------------------------------------");
                System.out.println("ISBN: "+ rs.getInt(1));
                System.out.println("Cantidad: "+rs.getInt(2));
                System.out.println("------------------------------------------");
                rs.close();
            }else{
                System.out.println("No existen unidades de ese libro o No existe el ISB del libro en la BD");
            }
            cn.close();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarUnidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
