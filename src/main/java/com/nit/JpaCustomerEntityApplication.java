package com.nit;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.entity.Customer;
import com.nit.repository.ICustomerRepository;
@SpringBootApplication
public class JpaCustomerEntityApplication 
{
	
	@Autowired
    private ICustomerRepository icr;
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(JpaCustomerEntityApplication.class, args);
		ICustomerRepository icr=ctx.getBean(ICustomerRepository.class);
//		icr.save(new Customer("Ekta","Rohankar","ekta@gmail.com","9988776655"));
//		icr.save(new Customer("Vaishnavi","Dhumane","vaishu@gmail.com","8877665544"));
//		icr.save(new Customer("Shafaq","Saiyyed","shafaq@gmail.com","7766554433"));

		List<Customer>list1=icr.findByLastName("Dhumane");
		System.out.println(list1);
		
		List<Customer>list2=icr.findByEmail("ekta@gmail.com");
		System.out.println(list2);
		
		List<Customer>list3=icr.findByFirstNameAndLastName("Ekta", "Rohankar");
		System.out.println(list3);
		
		List<Customer>list4=icr.findByPhoneNumberContaining("9988776655");
		System.out.println(list4);
		
		List<Customer>list5=icr.findByFirstNameStartingWith("S");
		System.out.println(list5);
		
		List<Customer>list6=icr.findByLastNameEndingWith("e");
		System.out.println(list6);
		
		
		
		 
		
		
		
	}

}