package com.lab.business.service;



import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lab.domain.entity.LogTracking;




@ContextConfiguration(locations = {"classpath:spring_config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TrackingServiceTest {

	@Autowired
	private TrackingService service;
	
	@Test
	public void getAllTest(){
		try {
			List<LogTracking> list=service.getAll();
			for(LogTracking log:list){
				System.out.println(log.getMessage());
			}
		}catch(Exception e){
			System.out.println(e);
		}
		
		
		
		
	}
}
