package com.lab.business.service;

import java.util.List;

import com.lab.business.exception.RefactoringBusinessException;
import com.lab.domain.entity.LogTracking;

/***
 * 
 * @author Daniel Pena Cueva
 *
 */
public interface TrackingService {
	
	public List<LogTracking> getAll() throws RefactoringBusinessException;
	public LogTracking saveTracking(LogTracking tracking) throws RefactoringBusinessException;
	
}
