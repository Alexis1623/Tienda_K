package com.tienda.tienda.service.impl;

import com.tienda.tienda.dao.CategoriaDao;
import com.tienda.tienda.domain.Categoria;
import com.tienda.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;
    @Override
    public List<Categoria> getCategorias(boolean activo) {
    var categorias=categoriaDao.findAll();
    if (activo ){
    //Eliminaria de la lista lasc ategorias... inactivas
    //Metodo remueva si los elementos son no activos
    categorias.removeIf(e -> !e.isActivo());
    }
    return categorias;
    }
}
    
