/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Categorias;
import java.util.List;
import servicio.CategoriasServicio;

/**
 *
 * @author user
 */
public class CategoriasControlador  {
    
    
    
    
      private final CategoriasServicio categoriasServicio = new CategoriasServicio();
    
        public Categorias crear(String [] args){
        
        var categorias = new Categorias(Integer.valueOf(args[0]),args[1]);
        
      
        
        this.categoriasServicio.crear(categorias);
        return categorias;
    }
    
    public List<Categorias> listar(){
        return this.categoriasServicio.listar();
    }
    
      public Categorias buscarPorCodigo (String arg){
      
      return this.categoriasServicio.buscarPorCodigo(Integer.valueOf(arg));
  }
 
}
