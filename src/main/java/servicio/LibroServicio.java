/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import modelo.Libro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class LibroServicio  implements ILibroServicio {
    
    private static List<Libro> libroList = new ArrayList<>();

    @Override
    public Libro crear(Libro libro) {
         this.libroList.add(libro);
        return libro; 
        
        
    }

    @Override
    public List<Libro> listar() {
        
        
        return this.libroList;
        
    }

    @Override
    public Libro buscarPorCodigo(int codigoLibro) {
        
       Libro libro=null;
        for(var b:this.libroList){
            if(codigoLibro==b.getCodigo()){
                libro=b;
                break;
            }
        }
        return libro;
        
    }

    @Override
    public int buscarPosicion(Libro libro) {
        
        int posicion=-1;
        for(var b:this.libroList){
            posicion ++;
            if (b.getCodigo()==libro.getCodigo()){
                break;
            }
        }
            
        return posicion;
 }
    
    
    
    
    
}
