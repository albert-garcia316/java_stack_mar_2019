package com.albertgarcia.dojoninjas.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.albertgarcia.dojoninjas.models.Dojo;
import com.albertgarcia.dojoninjas.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository dR;
	
	public DojoService(DojoRepository dR) {
		this.dR = dR;
	}

	public Dojo findDojo(Long id) {
		Optional<Dojo> optDojo = dR.findById(id);
		if(optDojo.isPresent()) {
			return optDojo.get();
		}
		return null;
	}
}
