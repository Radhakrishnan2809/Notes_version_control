package com.example.demo.response;

import java.util.List;

import com.example.demo.request.NotesTakerRequest;

public class NotesTakerResponse extends BaseResponse{

	private List<NotesTakerRequest> data;

	public List<NotesTakerRequest> getData() {
		return data;
	}

	public void setData(List<NotesTakerRequest> data) {
		this.data = data;
	}
	
	
	
	
}
