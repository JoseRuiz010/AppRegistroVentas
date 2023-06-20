package com.Jo.registroVentas.services.interfaces;

import java.util.List;

import com.Jo.registroVentas.model.DTO.CustomResponse;

public interface ICrudGenerico<T, ID> {

	CustomResponse<List<T>> getAll();

	CustomResponse<T> getById(ID id);

	CustomResponse<T> save(T entity);

	CustomResponse<T> update(ID id, T entity);

	CustomResponse<T> delete(ID id);
}
