package cs4r.labs.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cs4r.labs.webstore.domain.Customer;
import cs4r.labs.webstore.domain.repository.CustomerRepository;

/**
 * Dummy Implementation of {@link CustomerRepository} for in-memory products
 * 
 * @author cs4r
 *
 *
 */
@Repository
public final class InMemoryCustomerRepository implements CustomerRepository {

	private List<Customer> customers;

	public InMemoryCustomerRepository() {
		customers = new ArrayList<>();
		customers.add(new Customer(1, "Jose", "Calle España", 33));
		customers.add(new Customer(2, "François", "Rue de France", 34));
		customers.add(new Customer(3, "John", "England street", 44));
	}

	@Override
	public List<Customer> getAllCustomers() {
		return new ArrayList<>(customers);
	}

}
