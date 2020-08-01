package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notes_taker")
public class NotesTaker {

	@Id
	@Column(name = "version_id")
	private int versionId;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "create_ts")
	private String createTs;

	@Column(name = "update_ts")
	private String updateTs;

	public int getVersionId() {
		return versionId;
	}

	public void setVersionId(int versionId) {
		this.versionId = versionId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreateTs() {
		return createTs;
	}

	public void setCreateTs(String createTs) {
		this.createTs = createTs;
	}

	public String getUpdateTs() {
		return updateTs;
	}

	public void setUpdateTs(String updateTs) {
		this.updateTs = updateTs;
	}

}
