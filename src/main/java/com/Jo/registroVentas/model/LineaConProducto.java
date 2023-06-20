package com.Jo.registroVentas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class LineaConProducto extends LineaDeCuenta{

	private int amount;
	
	@ManyToOne
	private Producto producto;
	
}
