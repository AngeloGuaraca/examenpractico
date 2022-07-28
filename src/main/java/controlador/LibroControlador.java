/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Categorias;
import modelo.Libro;
import java.util.List;
import servicio.CategoriasServicio;
import servicio.LibroServicio;

/**
 *
 * @author user
 */
public class LibroControlador {
    private final LibroServicio libroServicio = new LibroServicio();
    private final CategoriasServicio  categoriasServicio = new CategoriasServicio();
    
    
    
     public Libro crear(String [] args){
        
         
         Categorias categorias=this.categoriasServicio.buscarPorCodigo(Integer.valueOf(args[0]));
         
         Libro libro = new Libro (categorias,Integer.valueOf(args[1]),args[2],Integer.valueOf(args[3]));
      
      
        
        this.libroServicio.crear(libro);
        return libro;
    }
    
  public List<Libro> listar(){
        return this.libroServicio.listar();
    }
    
  public Libro buscarPorCodigo (String arg){
      
      return this.libroServicio.buscarPorCodigo(Integer.valueOf(arg));
  }
  public Libro buscarLibro (String arg){
      return this.libroServicio.buscarPorCodigo(Integer.valueOf(arg));
      
  }
    
}
