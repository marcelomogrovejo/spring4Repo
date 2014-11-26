package com.concretepage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.dao.IPersonDAO;
import com.concretepage.entity.Person;

@Service
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
		Person p = personDao.saveOrUpdatePerson(person);
		return p;
	}

	@Override
	public void removePerson(Person p) {
		personDao.removePerson(p);		
	}
	
}
