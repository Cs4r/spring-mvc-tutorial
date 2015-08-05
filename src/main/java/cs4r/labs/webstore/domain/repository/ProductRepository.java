package cs4r.labs.webstore.domain.repository;

import java.util.List;

import cs4r.labs.webstore.domain.Product;

/**
 * Defines CRUD operations for {@link Product}s
 * 
 * TODO: add the rest of operations to this interface
 * 
 * @author cs4r
 *
 */
public interface ProductRepository {

	/**
	 * @return {@link List} with all present products in our warehouse
	 */
	List<Product> getAllProducts();

	/**
	 * Returns a product by its id
	 * 
	 * @param productId
	 *            id of the product you want to retrieve
	 * @return {@link Product} which has given id or null if it isn't found
	 */
	Product getProductById(String productId);

}
