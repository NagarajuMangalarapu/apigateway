 package com.spring.GuestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.GuestRepository.GuestRepository;

@RestController
public class GuestController {
	
	@Autowired
	private GuestRepository grepository;
	
	
	@GetMapping("/getguests")
	public ResponseEntity<String> getGeust(@PathVariable int id)
	{
	 grepository.getReferenceById(id);
	return new ResponseEntity<String>("hello", org.springframework.http.HttpStatus.OK);
	}

}
