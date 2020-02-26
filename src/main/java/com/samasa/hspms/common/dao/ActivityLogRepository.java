package com.samasa.hspms.common.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.samasa.hspms.common.dto.ActivityLog;

public interface ActivityLogRepository extends MongoRepository<ActivityLog, String> {

}
