package org.example;

import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;//autoincremento
    private Date fechaRegistro;
    private boolean vip;

    private static int contadorCliente;//static para que no se pueda acceder fuera de la clase y sea unico de la clase, y no se pueda modificar

    //Constructores

    public Cliente() {
    }

    public Cliente(Date fechaRegistro, boolean vip) {
        this.idCliente = ++contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public static int getContadorCliente() {
        return contadorCliente;
    }

    @Override
    public String toString() {
        return "****Datos del cliente****" +
                "\nNombre del cliente: " + super.getNombre() +
                "\nId Cliente: " + idCliente +
                "\nFecha Registro: " + fechaRegistro +
                "\nVIP: " + vip;
    }
}
