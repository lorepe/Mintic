/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librosdb.Modelo.VO;

/**
 *
 * @author lorep
 */
public class Libro {
    private int isbn;
    private String titulo;
    private int anio;

    public Libro() {
    }

    public Libro(int isbn, String titulo, int anio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", anio=" + anio + '}';
    }
    
}
