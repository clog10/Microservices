package com.springboot.app.item.springbootservicioitem.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.commons.commons.entity.Producto;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private Producto producto;
    private Integer cantidad;

    public Double getTotal(){
        return producto.getPrecio() * cantidad.doubleValue();
    }

}
