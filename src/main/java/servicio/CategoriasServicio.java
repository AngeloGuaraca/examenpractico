/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import modelo.Categorias;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class CategoriasServicio implements ICategoriasServicio{
    
      private static List<Categorias> categoriasList = new ArrayList<>();

    @Override
    public Categorias crear(Categorias categorias) {
           
        this.categoriasList.add(categorias);
        return categorias; 
    }

    @Override
    public List<Categorias> listar() {
        
        return this.categoriasList;
    }

    @Override
    public Categorias buscarPorCodigo(int codigoCategorias) {
        
         Categorias categorias=null;
        for(var c:this.categoriasList){
            if(codigoCategorias==c.getCodigo()){
                categorias=c;
                break;
            }
        }
        return categorias;
   }

    @Override
    public int buscarPosicion(Categorias categorias) {
        
          int posicion=-1;
        for(var c:this.categoriasList){
            posicion ++;
            if (c.getCodigo()==categorias.getCodigo()){
                break;
            }
        }
            
        return posicion;
    }
    
    
    
    
    
}
