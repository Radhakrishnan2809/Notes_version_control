package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.NotesTakerRepository;
import com.example.demo.request.NotesTakerRequest;
import com.example.demo.service.NotesTakerService;

@Service
public class NotesTakerServiceImpl implements NotesTakerService {

	@Autowired
	NotesTakerRepository notesTakerRepository;

	@Override
	public void saveNotes(NotesTakerRequest notesTakerRequest) {
		notesTakerRepository.saveNotes(notesTakerRequest.getTitle(), notesTakerRequest.getDescription());
	}

	@Override
	public void updateNotes(NotesTakerRequest notesTakerRequest) {
		notesTakerRepository.updateNotes(notesTakerRequest.getTitle(), notesTakerRequest.getDescription());
	}

}
