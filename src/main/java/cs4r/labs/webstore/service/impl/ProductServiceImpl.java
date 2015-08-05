package cs4r.labs.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs4r.labs.webstore.domain.Product;
import cs4r.labs.webstore.domain.repository.ProductRepository;
import cs4r.labs.webstore.service.ProductService;

/**
 * Simple implementation of {@link ProductService}
 * 
 * @author cs4r
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

}
