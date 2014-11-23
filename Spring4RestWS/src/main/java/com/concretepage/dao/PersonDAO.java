package com.concretepage.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.concretepage.entity.Person;

@Component
public class PersonDAO implements IPersonDAO {

	public List<Person> listPersons() {
		
		List<Person> persons = session.createQuery("form Person");
		return persons;
	}

	@Override
	public Person getPerson(Long id) {
		Person p = session.createQuery(Person.class, id);
		return p;
	}

	@Override
	public Person addPerson(Person person) {
		Person p = session.saveOrUpdate(person);
		return p;
	}
	
}
