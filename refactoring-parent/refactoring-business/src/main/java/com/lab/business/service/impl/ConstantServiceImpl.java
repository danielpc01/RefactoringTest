package com.lab.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.business.exception.RefactoringBusinessException;
import com.lab.business.service.ConstantService;
import com.lab.domain.entity.Constant;
import com.lab.domain.repository.ConstantRepository;

@Service
public class ConstantServiceImpl implements ConstantService  {
	
	@Autowired
	private ConstantRepository constantRepository;
	
	public Constant findByValue1AndFatherId(String value1, Long fatherId)throws RefactoringBusinessException {
		Constant constant=constantRepository.
				findByValue1AndFatherId(
						value1, 
						fatherId);
		return constant;
	}

}
