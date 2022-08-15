package org.bean.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
@Id
@GeneratedValue
	private long id;


	@NotB
	private String name;
	
	
	private String email;
}
