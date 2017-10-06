package com.lab.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.lab.domain.entity.LogTracking;

public interface LogTrackingRepository extends CrudRepository<LogTracking, Long> {

}
