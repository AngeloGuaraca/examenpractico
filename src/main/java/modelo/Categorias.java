/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author user
 */
public class Categorias {
    private int codigo ;
    private String descripcion;

    public Categorias(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Categorias(Integer codigo,String descripcion) {
        
         this.codigo = codigo;
        this.descripcion = descripcion;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Categorias{" + "codigo=" + codigo + ", descripcion=" + descripcion + '}';
    }
    
    
}
