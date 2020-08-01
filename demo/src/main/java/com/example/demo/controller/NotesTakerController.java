package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.RequestData;
import com.example.demo.request.NotesTakerRequest;
import com.example.demo.service.NotesTakerService;

@RestController
@RequestMapping("/notesTaker")
public class NotesTakerController {

	@Autowired
	NotesTakerService notesTakerService;

	// save notes in db
	@PostMapping(value = "", produces = "application/json")
	public ResponseEntity<String> saveNotes(@RequestBody RequestData<NotesTakerRequest> notesTakerRequest) {
		try {
			notesTakerService.saveNotes(notesTakerRequest.getData());
			return new ResponseEntity<>("Success", HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
		}

	}

	// edit notes
	@PutMapping(value = "", produces = "application/json")
	public ResponseEntity<String> updateNotes(@RequestBody RequestData<NotesTakerRequest> notesTakerRequest) {
		try {
			notesTakerService.updateNotes(notesTakerRequest.getData());
			return new ResponseEntity<>("Success", HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
		}

	}


}
