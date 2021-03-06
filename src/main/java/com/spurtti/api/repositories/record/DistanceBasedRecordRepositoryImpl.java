package com.spurtti.api.repositories.record;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import com.spurtti.api.collection.DistanceBasedRecord;

public class DistanceBasedRecordRepositoryImpl extends AbstractRecordRepository
		implements DistanceBasedRecordRepositoryCustom {

	@Inject
	private MongoTemplate mongoTemplate;

	@Override
	public List<DistanceBasedRecord> searchRecords(Map<String, Object> searchParams) {
		Query query = new Query();
		handleCommonSearchCriteria(query, searchParams);
		handleSearchCriteria(query, searchParams);
		return mongoTemplate.find(query, DistanceBasedRecord.class);
	}
	
	private void handleSearchCriteria(Query query, Map<String, Object> searchParams) {
		// TODO
	}
}
