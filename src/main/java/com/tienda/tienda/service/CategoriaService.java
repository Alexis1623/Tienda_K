package com.tienda.tienda.service;

import com.tienda.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    // define la firma del metodo para obtener 
    //los registros de la tabla categoria
   public List<Categoria> getCategorias(boolean activo);
    
    
    
}
