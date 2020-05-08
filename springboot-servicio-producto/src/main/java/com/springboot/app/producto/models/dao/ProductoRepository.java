package com.springboot.app.producto.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.app.commons.models.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
