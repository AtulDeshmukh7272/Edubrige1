package org.spring.entity;

import java.util.List;

public class Library {
	
	private int libraryId;
	private String libraryName;
	private List<String> libraryEntry;
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Library(int libraryId, String libraryName, List<String> libraryEntry) {
		super();
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.libraryEntry = libraryEntry;
	}
	public int getLibraryId() {
		return libraryId;
	}
	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public List<String> getLibraryEntry() {
		return libraryEntry;
	}
	public void setLibraryEntry(List<String> libraryEntry) {
		this.libraryEntry = libraryEntry;
	}
	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", libraryEntry=" + libraryEntry
				+ "]";
	}
	


}