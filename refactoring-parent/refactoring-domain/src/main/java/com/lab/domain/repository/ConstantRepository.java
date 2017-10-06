package com.lab.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.lab.domain.entity.Constant;

public interface ConstantRepository extends CrudRepository<Constant, Long> {

	
	public Constant findByValue1AndFatherId(String value1, Long fatherId);
	
}
