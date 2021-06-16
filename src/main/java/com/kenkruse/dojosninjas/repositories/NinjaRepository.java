package com.kenkruse.dojosninjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kenkruse.dojosninjas.models.Ninja;

@Repository

public interface NinjaRepository extends CrudRepository<Ninja, Long> {

}
