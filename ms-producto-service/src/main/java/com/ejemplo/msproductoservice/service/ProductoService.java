package com.ejemplo.msproductoservice.service;

import com.ejemplo.msproductoservice.entity.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> listar();
    Optional<Producto> buscarPorId(Integer id);
    Producto guardar(Producto producto);
    Producto actualizar(Integer id, Producto producto);
    void eliminar(Integer id);
}
