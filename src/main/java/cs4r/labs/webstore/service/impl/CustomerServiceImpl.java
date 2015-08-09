package cs4r.labs.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs4r.labs.webstore.domain.Customer;
import cs4r.labs.webstore.domain.repository.CustomerRepository;
import cs4r.labs.webstore.service.CustomerService;

/**
 * Simple implementation of {@link CustomerService}
 * 
 * @author cs4r
 *
 */
@Service
public final class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.getAllCustomers();
	}

}
