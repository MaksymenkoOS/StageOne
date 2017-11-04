package org.flat8.sked.stageone;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class SchoolClass {
	private String name;
	private int numberOfStudents;
	private SchoolStudent captain;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public SchoolStudent getCaptain() {
		return captain;
	}
	public void setCaptain(SchoolStudent captain) {
		this.captain = captain;
	}

	private List<SchoolStudent>studentsInClass = new LinkedList<>();
	/** Thinking 
	private List<SchoolSubjects> subjects = new LinkedList<>();	*/
	
	public SchoolClass(String name, int numberOfStudents, SchoolStudent captain) {
		super();
		this.name = name;
		this.numberOfStudents = numberOfStudents;
		this.captain = captain;
	}
	
}
