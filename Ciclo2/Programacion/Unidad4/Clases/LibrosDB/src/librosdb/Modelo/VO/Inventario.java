/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librosdb.Modelo.VO;

/**
 *
 * @author lorep
 */
public class Inventario {
    private int cantidad;

    public Inventario() {
    }

    public Inventario(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Inventario{" + "cantidad=" + cantidad + '}';
    }
    
}
