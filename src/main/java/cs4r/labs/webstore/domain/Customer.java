package cs4r.labs.webstore.domain;

/**
 * Represents a customer in the business domain
 * 
 * XXX: Is to make it immutable worth??
 * 
 * TODO: Constructor too ugly, consider builder
 * 
 * 
 * @author cs4r
 *
 */
public class Customer {

	private int customerId;
	private String name;
	private String address;
	private int numberOfOrdersMade;

	public Customer(int customerId, String name, String address, int numberOfOrdersMade) {
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.numberOfOrdersMade = numberOfOrdersMade;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumberOfOrdersMade() {
		return numberOfOrdersMade;
	}

	public void setNumberOfOrdersMade(int numberOfOrdersMade) {
		this.numberOfOrdersMade = numberOfOrdersMade;
	}

}
