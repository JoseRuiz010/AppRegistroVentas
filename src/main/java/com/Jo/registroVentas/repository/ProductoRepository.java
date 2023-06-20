package com.Jo.registroVentas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Jo.registroVentas.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {
	
}
