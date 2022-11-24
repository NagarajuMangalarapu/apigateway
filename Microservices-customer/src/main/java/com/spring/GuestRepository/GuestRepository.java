package com.spring.GuestRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.GuestEntity.Guest;

public interface GuestRepository extends JpaRepository<Guest,Integer>{
	
	public List<Guest> findByPgid(Integer pgid);

}
