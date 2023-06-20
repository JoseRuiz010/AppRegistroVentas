package com.Jo.registroVentas.model;

 

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente  extends Persona{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
	private Boolean enabled;
	private LocalDate create_at;
	
	@OneToMany(mappedBy = "cliente")
	private List<Cuenta>cuentas;
	
	
	 
	@PrePersist
	public void setValues() {
		this.enabled=true;
		this.create_at= LocalDate.now();
	}
}
