package com.spurtti.api.controller.record;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spurtti.api.dto.response.DistanceBasedRecordDto;
import com.spurtti.api.services.record.DistanceBasedRecordService;

@RestController
@RequestMapping(AbstractRecordController.CONTEXT_PATH + "/distance-based")
public class DistanceBasedRecordController {
	
	@Inject
	private DistanceBasedRecordService service;

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DistanceBasedRecordDto> createRecord(@RequestBody DistanceBasedRecordDto recordDto) {
		return new ResponseEntity<DistanceBasedRecordDto>(service.createRecord(recordDto), HttpStatus.OK);
	}
}
