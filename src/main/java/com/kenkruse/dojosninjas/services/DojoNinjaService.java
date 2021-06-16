package com.kenkruse.dojosninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kenkruse.dojosninjas.models.Dojo;
import com.kenkruse.dojosninjas.models.Ninja;
import com.kenkruse.dojosninjas.repositories.DojoRepository;
import com.kenkruse.dojosninjas.repositories.NinjaRepository;

@Service

public class DojoNinjaService {
	
	private final DojoRepository dojoRepository;
	private final NinjaRepository ninjaRepository;
	
	public DojoNinjaService(DojoRepository dojoRepository, NinjaRepository ninjaRepository) {
		this.dojoRepository = dojoRepository;
		this.ninjaRepository = ninjaRepository;
	}

	public void addDojo(Dojo dojo) {
		dojoRepository.save(dojo);
	}
	
	public List<Dojo> getAllDojos() {
		return dojoRepository.findAll();
	}
	
	public Dojo singleDojo(Long id) {
		Optional<Dojo> dojo = dojoRepository.findById(id);
		if(dojo.isPresent()) {
			return dojo.get();
		}
		else {
			return null;
		}
	}
	
	public void addNinja(Ninja ninja) {
		ninjaRepository.save(ninja);
	}

}
