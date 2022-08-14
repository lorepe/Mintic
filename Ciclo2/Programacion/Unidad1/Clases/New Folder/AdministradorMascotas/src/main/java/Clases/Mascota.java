/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author lorep
 */
public class Mascota {
    private String codigo;
    private String nombre;
    private int annio_nac;
    private String raza;
    private String color;
    private String estado_salud;

    public Mascota() {
    }

    public Mascota(String codigo, String nombre, int annio_nac, String raza, String color, String estado_salud) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.annio_nac = annio_nac;
        this.raza = raza;
        this.color = color;
        this.estado_salud = estado_salud;
    }
    

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the annio_nac
     */
    public int getAnnio_nac() {
        return annio_nac;
    }

    /**
     * @param annio_nac the annio_nac to set
     */
    public void setAnnio_nac(int annio_nac) {
        this.annio_nac = annio_nac;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the estado_salud
     */
    public String getEstado_salud() {
        return estado_salud;
    }

    /**
     * @param estado_salud the estado_salud to set
     */
    public void setEstado_salud(String estado_salud) {
        this.estado_salud = estado_salud;
    }
}
