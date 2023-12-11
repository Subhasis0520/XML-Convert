package com.org.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Customer {

	private int id;
	private String name;
	private String gender;
	private long phone;
	
  }