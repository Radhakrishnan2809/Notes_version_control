package com.example.demo.service;

import com.example.demo.request.NotesTakerRequest;

public interface NotesTakerService {

	void saveNotes(NotesTakerRequest notesTakerRequest);

	void updateNotes(NotesTakerRequest notesTakerRequest);

}
