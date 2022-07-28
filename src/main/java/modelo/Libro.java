/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author user
 */
public class Libro {
    private Categorias categorias;
    private int codigo;
    private String nombre;
    private int year;

    public Libro(Categorias categorias, int codigo, String nombre, int year) {
        this.categorias = categorias;
        this.codigo = codigo;
        this.nombre = nombre;
        this.year = year;
    }

    public Libro(Categorias categorias, Integer codigo, String nombre, Integer year) {
        
        this.categorias = categorias;
        this.codigo = codigo; 
        this.nombre = nombre;
        this.year = year;
        
    }


   


    public Categorias getCategorias() {
        return categorias;
    }

    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Libro{" + "categorias=" + categorias + ", codigo=" 
                + codigo + ", nombre=" + nombre + ", year=" + year + '}';
    }
    
    
}
