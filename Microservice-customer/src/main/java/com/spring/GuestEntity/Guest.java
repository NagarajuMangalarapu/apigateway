package com.spring.GuestEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guest {
	private Integer gid;
	private String gname;
	private Integer pgid;
	

}
