package cs4r.labs.webstore.domain.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

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

	/**
	 * Returns a list whose elements belong to a given category
	 * 
	 * @param category
	 *            string representing a category of products
	 * @return {@link List} of products of a given category
	 */
	List<Product> getProductsByCategory(String category);

	/**
	 * Returns a set of products which match a sequence of filters
	 * 
	 * @param filterParams
	 *            condition(s) to fulfill by products
	 * @return A {@link Set} of products that match some conditions
	 */
	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);

}
