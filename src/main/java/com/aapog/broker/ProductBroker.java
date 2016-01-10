package com.aapog.broker;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.aapog.entity.Product;

@Repository
public class ProductBroker implements IProductBroker {

	// private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Product> findAll() {

		List<Product> list = em.createQuery(" select p " +
										    " from Product p ").getResultList();
		
		return list;
	} 
     
	@Override
	public Product saveProduct(Product product) {
		
		Product productSaved = em.merge(product);
		
		return productSaved;
	}

	@Override
	public Product getProductById(Long id) {
		try {
			Product product = (Product) em.createQuery(" select p "
													+ " from Product p "
													+ " where p.id = :id ")
													.setParameter("id", id)
													.getSingleResult();

			return product;
			
		} catch (Exception e) { 
			e.printStackTrace();
			return null; 
		}
	}

	@Override
	public void deleteProductById(Long id) {
		
		Product product = getProductById(id);
		
		em.remove(product);
	}

}
