package com.spring.GuestRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.GuestEntity.Guest;

public interface GuestRepository extends JpaRepository<Guest,Integer>{
	
	

}
