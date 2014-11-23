package com.concretepage.dao;

import java.util.List;

import com.concretepage.entity.Person;

public interface IPersonDAO {
	
	/**
	 * Retrieves a list o persons
	 * @return
	 */
	List<Person> listPersons();

	/**
	 * Retrieves a person by id
	 * @param id
	 * @return
	 */
	Person getPerson(Long id);
	
	/**
	 * Adds or update a person
	 * @param person
	 * @return
	 */
	Person addPerson(Person person);
	
	/* TODO:
	 * 		1. deltePerson
	 * 		2. get a paginated list of persons
	 */
	
}
