package com.springboot.app.item.springbootservicioitem.models.service;

import java.util.List;

import com.springboot.app.item.springbootservicioitem.models.Item;
import com.commons.commons.entity.Producto;

public interface ItemService {

    public List<Item> findAll();
    public Item findById(Long id, Integer cantidad);

    public Producto save(Producto producto);

    public Producto update(Producto producto, Long id);

    public void delete(Long id);
    
}
