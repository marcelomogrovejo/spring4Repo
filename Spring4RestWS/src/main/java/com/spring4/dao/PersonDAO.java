package com.concretepage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.concretepage.entity.Person;

@Repository
public class PersonDAO implements IPersonDAO {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	@Transactional
	public List<Person> listPersons() {
		@SuppressWarnings("unchecked")
		List<Person> persons = entityManager.createQuery("from Person").getResultList();
		return persons;
	}

	@Override
	@Transactional
	public Person getPerson(Long id) {

		Person p = entityManager.find(Person.class, id);
		return p;
	}

	//TODO
	@Override
	@Transactional
	public Person saveOrUpdatePerson(Person person) {
		entityManager.getTransaction().begin();
		entityManager.persist(person);
		entityManager.getTransaction().commit();
		return person;
	}

	@Override
	@Transactional
	public void removePerson(Person person) {
		entityManager.getTransaction().begin();
		entityManager.remove(person);
		entityManager.getTransaction().commit();
	}
	
}
