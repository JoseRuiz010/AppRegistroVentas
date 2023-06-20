package com.Jo.registroVentas.model;

import java.time.LocalDate;
import java.util.List;

import com.Jo.registroVentas.StateCuenta;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate start_date;
	private LocalDate end_date;
	private StateCuenta state;
	
	@OneToMany(mappedBy = "cuenta")
	private List<LineaDeCuenta>lineasDeCuenta;
	
	@ManyToOne
	private Cliente cliente;
	
	@PrePersist()
	private void setData(){
		this.start_date=LocalDate.now();
		this.state=StateCuenta.ACTIVA;
	}
	
}
