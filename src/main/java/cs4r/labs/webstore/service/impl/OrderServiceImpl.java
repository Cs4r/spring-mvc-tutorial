package cs4r.labs.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs4r.labs.webstore.domain.Product;
import cs4r.labs.webstore.domain.repository.ProductRepository;
import cs4r.labs.webstore.service.OrderService;

/**
 * Simple implementation of {@link OrderService}
 * 
 * @author cs4r
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void processOrder(String productId, int quantity) {
		Product productById = productRepository.getProductById(productId);
		if (productById.getUnitsInStock() < quantity) {
			throw new IllegalArgumentException(
					"Out of Stock. Available Units in stock" + productById.getUnitsInStock());
		}

		productById.setUnitsInStock(productById.getUnitsInStock() - quantity);

	}

}