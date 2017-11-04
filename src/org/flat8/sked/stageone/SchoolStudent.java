package org.flat8.sked.stageone;

public class SchoolStudent {
	private String surname;
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	private String patronymic;
	public String getPatronymic() {
		return patronymic;
	}
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	
	public SchoolStudent(String  aSurname, String aName, String aPatronymic) {
		surname = aSurname;
		name = aName;
		patronymic = aPatronymic;
	}
}
