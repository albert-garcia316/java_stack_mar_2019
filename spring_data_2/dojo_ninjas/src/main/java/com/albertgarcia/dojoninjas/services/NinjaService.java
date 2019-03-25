package com.albertgarcia.dojoninjas.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.albertgarcia.dojoninjas.models.Dojo;
import com.albertgarcia.dojoninjas.models.Ninja;
import com.albertgarcia.dojoninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository nR;
	
	public NinjaService(NinjaRepository nR) {
		this.nR = nR;
	}

	public Ninja createNinja(Ninja ninja) {
		return nR.save(ninja);
	}

	public List<Ninja> findNinjas(Dojo dojo) {
		return nR.findByDojo(dojo);
	}
}
