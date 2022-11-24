package com.spring.GuestController;

import java.util.List;

import org.apache.http.HttpStatus;
//import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.GuestEntity.Guest;
import com.spring.GuestRepository.GuestRepository;

@RestController
@RequestMapping("/guests")
public class GuestController {
	
	@Autowired
	private GuestRepository grepository;
	
	
	@GetMapping("/getguests/{id}")
	public ResponseEntity<List<Guest>> getGeusts(@PathVariable int id)
	{
	
       List<Guest> listguests=     grepository.findByPgid(id);
	return new ResponseEntity<>(listguests, org.springframework.http.HttpStatus.OK);
	}
	
	@PostMapping("/addguests")
	public ResponseEntity<Guest> addGeust(@RequestBody Guest newGuest)
	{
	
       Guest newguest =     grepository.save(newGuest);
	return new ResponseEntity<>(newguest, org.springframework.http.HttpStatus.OK);
	}
	
//	@GetMapping("/sort/{field}")
//	public ResponseEntity<List<Guest>> guest(@PathVariable String field)
//	{
//	List<Guest> response=	grepository.findAll(Sort.by(Sort.Direction.ASC,field));
//		return new ResponseEntity<>(response,org.springframework.http.HttpStatus.OK);
//	}
	

}
