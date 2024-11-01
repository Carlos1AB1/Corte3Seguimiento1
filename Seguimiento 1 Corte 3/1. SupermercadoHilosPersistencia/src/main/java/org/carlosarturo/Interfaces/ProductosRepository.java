package org.carlosarturo.Interfaces;

import org.carlosarturo.Domain.Producto;


import java.util.List;

public interface ProductosRepository {
    void saveProducto(Producto producto);
    void updateProducto(Producto producto);

    void deleteProducto(int id);

    Producto findProductoById(int id);
    List<Producto> findAll();
}