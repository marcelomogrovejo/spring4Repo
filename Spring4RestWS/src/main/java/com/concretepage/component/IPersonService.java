package com.concretepage.component;

import java.util.List;

import com.concretepage.Person;

public interface IPersonService {
	
	public Person getPersonDetail(Long id);

	public List<Person> getPersons();
	
	public Person saveOrUpdate(Person person);

}
