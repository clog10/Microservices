package com.springboot.app.productos.springbootserviceproductos.models.service;

import java.util.List;

import com.commons.commons.entity.Producto;

public interface IProductoService {
    
    public List<Producto> findAll();
    public Producto findById(Long id);
    public Producto save(Producto producto);
    public void deleteById(Long id);
}
