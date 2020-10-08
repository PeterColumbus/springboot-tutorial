package com.example.test.com.example.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/customer")
public class CustomerController {
	private ArrayList<Customer> listCustomer = new ArrayList<Customer>();
	
	
	public CustomerController() {
		listCustomer.add(new Customer(1 ,"kevin", "MALE" ,"tangerang" ,"kevin@gmail.com" , "12345" , "True"));
		listCustomer.add(new Customer(2 ,"kevina", "FEMALE" ,"tangerang" ,"kevin@gmail.com" , "12345" , "False"));
		listCustomer.add(new Customer(3 ,"kevinb", "MALE" ,"tangerang" ,"kevin@gmail.com" , "12345" , "True"));
		listCustomer.add(new Customer(4 ,"kevinc", "FEMALE" ,"tangerang" ,"kevin@gmail.com" , "12345" , "False"));
	}
	
	@GetMapping()
	public ArrayList<Customer> getAllPeople() {
		
		return listCustomer;
	}
	
	@GetMapping("/{id}")
	public Customer getOnePeople(@PathVariable int id) {
		return listCustomer.get(id-1);
	}
	@GetMapping("/name/{name}")
	public Customer getByName(@PathVariable String name) {
		int n = listCustomer.size();
		for(int i=0; i<n; i++) {
			if(listCustomer.get(i).getName().compareToIgnoreCase(name)== 0) {
				return listCustomer.get(i);
			}
		}
		Customer error = new Customer(999, "Error", "Error", "Error","Error", "Error", "Error");
		
		return error;
	}
	
	@GetMapping("/gender/{gender}")
	public ArrayList<Customer> getByGender(@PathVariable String gender) {
		int n = listCustomer.size();
		ArrayList<Customer> temp = new ArrayList<Customer>();
		for(int i=0; i<n; i++) {
			if(listCustomer.get(i).getGender().compareToIgnoreCase(gender)== 0) {
				temp.add(listCustomer.get(i));
			}
		}
		return temp;
	}
	@GetMapping("/priority/{priority}")
	public ArrayList<Customer> getByPriority(@PathVariable String priority) {
		int n = listCustomer.size();
		ArrayList<Customer> temp = new ArrayList<Customer>();
		for(int i=0; i<n; i++) {
			if(listCustomer.get(i).getPriority().compareToIgnoreCase(priority)== 0) {
				temp.add(listCustomer.get(i));
			}
		}
		return temp;
	}
	
	/*
	{
	    "id": 5,
	    "name": "kevind",
	    "gender": "MALE",
	    "address": "tangerang",
	    "email": "kevin@gmail.com",
	    "phone": "12345",
	    "priority": "True"
	}
	*/
	
	@PostMapping()
	public String addCustomer(@RequestBody Customer customer) {
		if(customer.getGender().compareToIgnoreCase("male") == 0 || customer.getGender().compareToIgnoreCase("female") == 0 ) {
			int x = listCustomer.size();
			customer.setId(x+1);
			listCustomer.add(customer);
			return "Input Success";
		}
		else {
			return "Input Error try again !";
		}
	}
	
	@DeleteMapping("/{id}")
	public String deleteCustomer(@PathVariable int id) {
		listCustomer.remove(id-1);
		return "delete success";
	}
	
	@PutMapping("/{id}")
	public String updateCustomer(@RequestBody Customer customer, @PathVariable int id) {
		int x = listCustomer.size();
		//Customer temp = new Customer();
		
		if(id <= x) {
			//temp = listCustomer.get(id-1);
			
			if(customer.getName() != null)
				listCustomer.get(id-1).setName(customer.getName());
			if(customer.getPhone() != null)
				listCustomer.get(id-1).setPhone(customer.getPhone());
			if(customer.getAddress() != null)
				listCustomer.get(id-1).setAddress(customer.getAddress());
			if(customer.getGender() != null)
				listCustomer.get(id-1).setGender(customer.getGender());
			if(customer.getEmail() != null)
				listCustomer.get(id-1).setEmail(customer.getEmail());
			if(customer.getPriority() != null)
				listCustomer.get(id-1).setPriority(customer.getPriority());
			
			return "update success";
		}
		else {
			return "ID not found !!!";
		}
	}
	 
	
	
}
