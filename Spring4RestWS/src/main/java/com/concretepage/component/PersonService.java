package com.concretepage.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.concretepage.Person;

@Component
public class PersonService implements IPersonService {
	
	@Override
	public Person getPersonDetail(Long id){
		
		Person p = new Person();
		p.setId(id);
		p.setLocation("Varanasi");
		p.setName("Ram");
		return p;

	}
	
	@Override
	public List<Person> getPersons() {
		
		List<Person> persons = new ArrayList<Person>();
		
		Person personA = new Person();
		personA.setId(1L);
		personA.setLocation("Mendoza");
		personA.setName("Marcelo");
		persons.add(personA);
		
		Person personB = new Person();
		personB.setId(2L);
		personB.setLocation("San Juan");
		personB.setName("Pepe");
		persons.add(personB);
		
		return persons;

	}

	@Override
	public Person saveOrUpdate(Person person) {
		
		Person p = new Person();
		p.setId(new Random().nextLong());
		p.setLocation("Location" + new Random().nextInt());
		p.setName("Nombre" + new Random().nextInt());
		
		return p;
	}
	
}
