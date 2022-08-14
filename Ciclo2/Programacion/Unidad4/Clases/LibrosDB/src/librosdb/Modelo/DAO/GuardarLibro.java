/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librosdb.Modelo.DAO;

import librosdb.Conexion;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lorep
 */
public class GuardarLibro {
    public void guardar(int isbn,String titulo,int anio ){

        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            PreparedStatement ps = cn.prepareStatement("INSERT INTO libro VALUES(?,?,?)");
            
            ps.setInt(1, isbn);
            ps.setString(2, titulo);
            //Calendario
            Calendar fecha = new GregorianCalendar(anio,1,1);
            
            int anio_sql = fecha.get(Calendar.YEAR);
            //Tipo Calendario -- tipo Date sql
            java.sql.Date sqlDate = new java.sql.Date(anio_sql);
            
            ps.setDate(3, sqlDate);
            ps.executeUpdate();
            System.out.println("Libro guardado con éxito...");
            
            //Cerrar la conexion 
            cn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(GuardarLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
}
