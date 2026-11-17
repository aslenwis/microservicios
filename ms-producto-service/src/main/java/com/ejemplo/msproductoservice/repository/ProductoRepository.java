package com.ejemplo.msproductoservice.repository;

import com.ejemplo.msproductoservice.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
