package com.tienda.tienda.service;

import com.tienda.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {
    // define la firma del metodo para obtener 
    //los registros de la tabla producto
   public List<Producto> getProductos(boolean activo);
    
    //Se recupera un objeto tipo producto que corresponde 
   //al registro de la producto que tiene el mismo idProducto
    
   public Producto getProducto(Producto producto);
   
   //Se elimina el registro que posee el idProducto pasado por parametro
   public void delete (Producto producto);
   
   //Si hay un registro en la tabla productos que tiene el idProductos
   //Ese registro se actualiza, si no existe, o el idProducto  es nulo
   //Se crea un nuevo registro en la tabla producto
   public void save(Producto producto);
   
}
