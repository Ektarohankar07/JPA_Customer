package com.nit.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nit.entity.Customer;

public interface ICustomerRepository extends CrudRepository<Customer, Long>
{
	public List<Customer> findByLastName(String lastName);
	public List<Customer> findByEmail(String email);
	public List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
	public List<Customer> findByPhoneNumberContaining(String phoneNumber);
	public List<Customer> findByFirstNameStartingWith(String prefix);
	public List<Customer> findByLastNameEndingWith(String suffix);


}
