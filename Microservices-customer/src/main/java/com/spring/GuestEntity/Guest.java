package com.spring.GuestEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guest {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer gid;
	private String gname;
	private Integer pgid;
	

}
