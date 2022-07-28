/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import modelo.Categorias;
import java.util.List;

/**
 *
 * @author user
 */
public interface ICategoriasServicio {
    public Categorias crear(Categorias categorias);
    public List<Categorias> listar(); 
      public Categorias buscarPorCodigo(int codigoCategorias);
      public int buscarPosicion (Categorias categorias);
    
    
}
