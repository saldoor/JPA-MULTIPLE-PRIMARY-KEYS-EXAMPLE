package com.example.primarykeyexample;

import com.example.primarykeyexample.model.Customer;
import com.example.primarykeyexample.repository.CusromerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/customer")
public class PrimarykeyexampleApplication {

	@Autowired
	CusromerRepository cusromerRepository;

	@PostMapping
	public Customer save(@RequestBody Customer customer){
		return cusromerRepository.save(customer);
	}

	@GetMapping
	public List<Customer> getAll(){
		return cusromerRepository.findAll();
	}

    public static void main(String[] args) {
        SpringApplication.run(PrimarykeyexampleApplication.class, args);
    }

}
