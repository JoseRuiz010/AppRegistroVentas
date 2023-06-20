package com.Jo.registroVentas.model;

import java.util.List;

import com.Jo.registroVentas.model.enums.Capacidad;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String descripcion;
	private String image;
	private Capacidad capacity;
	private double precio;
	
	@OneToOne(fetch = FetchType.EAGER)
	private Marca marca;
	
	@OneToMany(mappedBy = "producto",fetch = FetchType.LAZY)
	private List <LineaConProducto> lineaDeCuenta;
}

