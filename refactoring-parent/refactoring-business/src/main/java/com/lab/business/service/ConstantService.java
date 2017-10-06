package com.lab.business.service;

import com.lab.business.exception.RefactoringBusinessException;
import com.lab.domain.entity.Constant;
/***
 * 
 * @author Daniel Pena Cueva
 *
 */
public interface ConstantService {
	/***
	 * 
	 * @param value1
	 * @param fatherId
	 * @return
	 */
	public Constant findByValue1AndFatherId(String value1, Long fatherId) throws RefactoringBusinessException;
}
