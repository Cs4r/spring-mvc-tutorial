package cs4r.labs.webstore.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import cs4r.labs.webstore.domain.Product;

/**
 * TODO: Doc
 * 
 * @author cs4r
 *
 */
public interface ProductService {

	/**
	 * @return {@link List} with all products
	 */
	List<Product> getAllProducts();

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

	Product getProductById(String productId);
}
