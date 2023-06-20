package com.Jo.registroVentas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Jo.registroVentas.model.Producto;
import com.Jo.registroVentas.model.DTO.CustomResponse;
import com.Jo.registroVentas.services.interfaces.IProductServices;

@RestController
@RequestMapping("products")
public class ProductController {

	IProductServices productService;

	public ProductController(IProductServices productServices) {
		this.productService = productServices;
	}

	@GetMapping("/")
	private CustomResponse<List<Producto>> getAll() {
		return productService.getAll();
	}

	@GetMapping("/{id}")
	private CustomResponse<Producto> getById(@PathVariable(name = "id") Long id) {
		var p = productService.getById(id);

		return p;
	}

	@PostMapping("/")
	private CustomResponse<Producto> newProduct(@RequestBody(required = true) Producto producto) {
		return productService.save(producto);
	}

}
