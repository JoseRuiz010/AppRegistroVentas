package com.Jo.registroVentas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Jo.registroVentas.model.Producto;
import com.Jo.registroVentas.model.DTO.CustomResponse;
import com.Jo.registroVentas.repository.ProductoRepository;
import com.Jo.registroVentas.services.interfaces.IProductServices;

@Service
public class ProductServicesImpl implements IProductServices {

	private ProductoRepository productRepository;

	public ProductServicesImpl(ProductoRepository productoRepository) {
		this.productRepository = productoRepository;
	}

	@Override
	public CustomResponse<List<Producto>> getAll() {
		List<Producto> products = productRepository.findAll();
		return new CustomResponse<List<Producto>>(products, null);
	}

	@Override
	public CustomResponse<Producto> getById(Long id) {
		Optional<Producto> opProduct = productRepository.findById(id);

		if (opProduct.isPresent()) {
			return new CustomResponse<Producto>(opProduct.get(), null);
		}else {
			return new CustomResponse<Producto>(null, "No se encontro ningun producto");
		}
	}

	@Override
	public CustomResponse<Producto> save(Producto entity) {

		Producto prod = productRepository.save(entity);

		return new CustomResponse<Producto>(prod, null);
	}

	@Override
	public CustomResponse<Producto> update(Long id, Producto entity) {

		Producto p = getById(id).getData();

		p.setDescripcion(entity.getDescripcion());
		p.setCapacity(entity.getCapacity());
		p.setMarca(entity.getMarca());
		p.setName(entity.getName());
		p.setPrecio(entity.getPrecio());

		productRepository.save(p);
		return new CustomResponse<Producto>(p, null);
	}

	@Override
	public CustomResponse<Producto> delete(Long id) {
		Producto p = getById(id).getData();
		productRepository.delete(p);
		return new CustomResponse<Producto>(p, null);
	}

}
