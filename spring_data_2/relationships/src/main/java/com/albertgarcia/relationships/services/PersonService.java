package com.albertgarcia.relationships.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.albertgarcia.relationships.models.Person;
import com.albertgarcia.relationships.repositories.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository pR;
	
	public PersonService(PersonRepository pR) {
		this.pR = pR;
	}



	public List<Person> allPersons(){
		return pR.findAll();
	}

	public Person createPerson(Person person) {
		return pR.save(person);
	}

	public Person findPerson(Long id) {
		Optional<Person> oP = pR.findById(id);
		if(oP.isPresent()) {
			return oP.get();
		}
		return null;
	}

}
