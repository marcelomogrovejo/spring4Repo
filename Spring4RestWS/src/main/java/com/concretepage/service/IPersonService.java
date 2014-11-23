package com.concretepage.service;

import java.util.List;

import com.concretepage.entity.Person;

public interface IPersonService {
	
	/**
	 * Gets a person
	 * @param id
	 * @return
	 */
	Person getPersonDetail(Long id);

	/**
	 * List all persons
	 * @return
	 */
	List<Person> getPersons();
	
	/**
	 * Save a person
	 * @param person
	 * @return
	 */
	Person saveOrUpdate(Person person);
	
	/* TODO:
	 * 		1. deltePerson
	 * 		2. list persons paginated
	 */

}
