package com.concretepage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.concretepage.component.IPersonService;

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
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Person save(@RequestBody Person person) {
		
		Person p = personService.saveOrUpdate(person);
		return p;
		
	}
	
	
}