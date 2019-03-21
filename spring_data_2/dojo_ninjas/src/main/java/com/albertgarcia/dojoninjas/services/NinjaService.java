package com.albertgarcia.dojoninjas.services;

import org.springframework.stereotype.Service;

import com.albertgarcia.dojoninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository nR;
	
	public NinjaService(NinjaRepository nR) {
		this.nR = nR;
	}
}
