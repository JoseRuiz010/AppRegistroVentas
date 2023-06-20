package com.Jo.registroVentas.model;

 
import java.io.Serializable;

import org.hibernate.validator.constraints.UniqueElements;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@MappedSuperclass
public class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String name;
	@NotBlank
	private String lastName;
	private String phone;
	private String address;
	@NotBlank
	@UniqueElements
	private String email;

}
