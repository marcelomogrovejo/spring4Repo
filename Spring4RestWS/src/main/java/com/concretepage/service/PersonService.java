package com.concretepage.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.concretepage.dao.IPersonDAO;
import com.concretepage.entity.Person;

@Component
public class PersonService implements IPersonService {
	
	@Autowired
	IPersonDAO personDao;
	
	@Override
	public Person getPersonDetail(Long id){
		
		Person person = personDao.getPerson(id);
		return person;

	}
	
	@Override
	public List<Person> getPersons() {
		
		List<Person> persons = personDao.listPersons();
		return persons;

	}

	@Override
	public Person saveOrUpdate(Person person) {
		
		Person p = personDao.addPerson(person);
		return p;

	}
	
}
