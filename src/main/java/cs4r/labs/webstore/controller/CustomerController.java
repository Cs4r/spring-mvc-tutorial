package cs4r.labs.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cs4r.labs.webstore.service.CustomerService;

/**
 * Controller to process orders
 * 
 * @author cs4r
 *
 */
@Controller
public class CustomerController {

	@Autowired
	private CustomerService productService;

	@RequestMapping("/customers")
	public String list(Model model) {
		model.addAttribute("customers", productService.getAllCustomers());
		return "customers";
	}

}
