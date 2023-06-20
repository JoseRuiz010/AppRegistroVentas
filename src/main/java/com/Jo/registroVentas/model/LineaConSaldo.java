package com.Jo.registroVentas.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class LineaConSaldo extends LineaDeCuenta{

	private long monto;
	private String description;
}
