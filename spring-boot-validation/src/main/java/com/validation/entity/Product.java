package com.validation.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
		@Id
		private long id;
		@NotEmpty(message="product name can not be empty")
		@Size(max = 20,message="product name con not morethan 20chr")
		@Size(min =5,message ="more tha 5 char")
		  private String name;
		@NotEmpty(message="product decription can nort be empty")
		  private String description;
		@NotNull(message =" price cannot be null")
		private double price;

}
