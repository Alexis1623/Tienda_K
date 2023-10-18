package com.tienda.tienda.service;

import com.tienda.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    // define la firma del metodo para obtener 
    //los registros de la tabla categoria
   public List<Categoria> getCategorias(boolean activo);
    
    //Se recupera un objeto tipo categoria que corresponde 
   //al registro de la categoria que tiene el mismo idCategoria
    
   public Categoria getCategoria(Categoria categoria);
   
   //Se elimina el registro que posee el idCategoria pasado por parametro
   public void delete (Categoria categoria);
   
   //Si hay un registro en la tabla categorias que tiene el idCategorias
   //Ese registro se actualiza, si no existe, o el idCategoria  es nulo
   //Se crea un nuevo registro en la tabla categoria
   public void save(Categoria categoria);
   
}
