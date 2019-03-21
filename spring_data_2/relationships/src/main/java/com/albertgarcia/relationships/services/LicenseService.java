package com.albertgarcia.relationships.services;


import org.springframework.stereotype.Service;

import com.albertgarcia.relationships.models.License;
import com.albertgarcia.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	private final LicenseRepository lR;

	public LicenseService(LicenseRepository lR) {
		this.lR = lR;
	}

	public License createLicense(License license) {
		return lR.save(license);
	}

	public void updateLicense(License l) {
		lR.save(l);
	}
	
}
