package com.lab.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.business.exception.RefactoringBusinessException;
import com.lab.business.service.TrackingService;
import com.lab.domain.entity.LogTracking;
import com.lab.domain.repository.LogTrackingRepository;


@Service
public class TrackingServiceImpl implements TrackingService{

	@Autowired
	private LogTrackingRepository logTrackingRepository;
	
	
	
	public List<LogTracking> getAll() throws RefactoringBusinessException{
		
		List<LogTracking> list=(List<LogTracking>) logTrackingRepository.findAll();
		
		return list;
	}


	public LogTracking saveTracking(LogTracking tracking)throws RefactoringBusinessException {
		
		return logTrackingRepository.save(tracking);
	}
	
	
}
