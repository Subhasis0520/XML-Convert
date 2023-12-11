package com.org.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.org.binding.Customer;

public class UnMarshalDemo {

	public static void main(String[] args) throws Exception {
		File f = new File("customer.xml");
		JAXBContext context = JAXBContext.newInstance(Customer.class);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Object object = unmarshaller.unmarshal(f);
		Customer c = (Customer) object;
		
		System.out.println(c);
	}
}
