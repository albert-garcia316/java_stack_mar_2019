package com.albertgarcia.dojoninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.albertgarcia.dojoninjas.models.Dojo;
import com.albertgarcia.dojoninjas.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	List<Ninja> findAll();

	List<Ninja> findByDojo(Dojo dojo);
}
