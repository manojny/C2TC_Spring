package com.example.demo;


import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
@Autowired
	private CustomerService service;
	
	@GetMapping("/customer")
	public List<Customer> list(){
		return service.listAll();
	}
	
	@GetMapping("/customer/id")
	public ResponseEntity<Customer> get(@PathVariable Integer id){
		try {
			Customer Customer = service.get(id);
			return new ResponseEntity<Customer> (Customer, HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/customer")
	public void add(@RequestBody Customer Customer) {
		service.save(Customer);
	}
	
	@PutMapping("/customer/{id}")
	public ResponseEntity<?> update(@RequestBody Customer Customer, @PathVariable Integer id){
		try {
			Customer existCustomer = service.get(id);
			return new ResponseEntity<Customer> (Customer, HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}	
	}
	@DeleteMapping("/customer/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}
