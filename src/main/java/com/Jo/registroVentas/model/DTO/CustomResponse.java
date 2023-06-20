package com.Jo.registroVentas.model.DTO;

import javax.xml.crypto.Data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomResponse <TYPE> {

	private TYPE data;
	private String error;
}
