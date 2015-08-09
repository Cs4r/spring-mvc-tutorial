package cs4r.labs.webstore.domain.repository;

import java.util.List;

import cs4r.labs.webstore.domain.Customer;

/**
 * Defines CRUD operations for {@link Customer}s
 * 
 * TODO: add the rest of operations to this interface
 * 
 * @author cs4r
 *
 */
public interface CustomerRepository {

	/**
	 * @return {@link List} with all customers in our warehouse
	 */
	List<Customer> getAllCustomers();

}
