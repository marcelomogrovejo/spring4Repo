package com.spring4.dao;

import java.util.List;

import com.spring4.entity.Person;

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
	Person saveOrUpdatePerson(Person person);
	
	/**
	 * Removes a person
	 * @param id
	 * @return
	 */
	void removePerson(Person person);
	
	/* TODO:
	 * 		1. get a paginated list of persons
	 */
}
