package com.concretepage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.concretepage.component.IPersonService;
import com.concretepage.test.Persona;

@RestController
@RequestMapping("/data")
public class PersonController {
	@Autowired
	private IPersonService personService;
	
	@RequestMapping(value="/person", method=RequestMethod.GET)
	public Persona getPersonDetail(@RequestParam(value = "id",required = false,
	                                                    defaultValue = "0") Long id) {
		return personService.getPersonDetail(id);
		
	}
	
	@RequestMapping(value="/person", method=RequestMethod.POST)
	public Persona createPerson(@RequestBody(required=true) Persona p) {
		return personService.createPersona(p.getNombre());

	}
}