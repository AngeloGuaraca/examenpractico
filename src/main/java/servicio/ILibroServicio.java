/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import modelo.Categorias;
import modelo.Libro;
import java.util.List;

/**
 *
 * @author user
 */
public interface ILibroServicio {
    public Libro crear(Libro libro);
    public List<Libro> listar(); 
    public Libro buscarPorCodigo(int codigoLibro);
    public int buscarPosicion (Libro libro);
    
    
    
    
    
}
