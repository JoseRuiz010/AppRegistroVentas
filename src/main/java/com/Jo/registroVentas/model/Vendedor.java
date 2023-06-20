package com.Jo.registroVentas.model;

 
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Entity
public class Vendedor extends Persona implements Serializable{

 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Boolean enabled;
	private LocalDate create_at;
	@OneToMany(mappedBy = "vendedor")
	private List<LineaDeCuenta> lineadecuentas;
	
	List<String> names;
	@PrePersist
	public void setValues() {
		this.enabled=true;
		this.create_at= LocalDate.now();
	}
}
