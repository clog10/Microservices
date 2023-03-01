package com.springboot.app.productos.springbootserviceproductos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.commons.commons.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {

    
    
}
