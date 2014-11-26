package com.concretepage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.concretepage.entity.Person;
import com.concretepage.service.IPersonService;

@RestController
@RequestMapping("/data/person")
public class PersonController {

	@Autowired
	private IPersonService personService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Person getPersonDetail(@PathVariable long id) {
		Person p = personService.getPersonDetail(id);
		return p;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Person> getPersons() {
		List<Person> persons = personService.getPersons();
		return persons;
	}

	//TODO: to test it, make a post uri and put it in the browser
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Person save(@RequestBody Person person) {
		Person p = personService.saveOrUpdate(person);
		return p;
	}
	
	//TODO: to test it, make a post uri and put it in the browser
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable long id) {
		Person p = new Person();
		p.setId(id);
		personService.removePerson(p);
	}
	
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.OK)
    public void updatePerson(@PathVariable long id, @RequestBody Person person) {
    	person.setId(id);
    	personService.saveOrUpdate(person);
    }

	
}