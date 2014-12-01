package com.concretepage.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.test.PeronaRepository;
import com.concretepage.test.Persona;

@Service
public class PersonService implements IPersonService {

	@Autowired
	private PeronaRepository peronaRepository;
	
	@Override
	public Persona getPersonDetail(Long id){
		return peronaRepository.findOne(id);
	}
		

	@Override
	public Persona createPersona(String name) {
		Persona p = new Persona();
		p.setNombre(name);
		return peronaRepository.save(p);
	}
}
