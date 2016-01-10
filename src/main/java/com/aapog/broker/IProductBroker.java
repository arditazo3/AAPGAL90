package com.aapog.broker;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.aapog.entity.Product;

public interface IProductBroker {

	public List<Product> findAll();
	
	public Product saveProduct(Product product);
	
	public Product getProductById(Long id);
	
	public void deleteProductById(Long id);
 	
}
