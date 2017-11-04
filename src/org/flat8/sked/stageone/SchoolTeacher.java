package org.flat8.sked.stageone;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class SchoolTeacher {
	private String surname;
	private String name;
	private String patronymic;
	
	public SchoolTeacher(String aSurname, String aName, String aPatronymic) {
		surname = aSurname;
		name = aName;
		patronymic = aPatronymic;
	}
	
	private List<SchoolSubjects> subjects = new LinkedList<>();
	void addSubjects(SchoolSubjects subject) {
		subjects.add(subject);
	}
	List<SchoolSubjects> getSubjects(){
		return subjects;
	}
	
	private List<LocalDateTime> busyTime = new LinkedList<>();
	void addBusyTime(LocalDateTime time) {
		if(busyTime.contains(time)) {
			System.out.println("Error! This time is already busy.");
		} else if (unavailableTime.contains(time)) {
			System.out.println("Error! This time is unavailable.");
		} else {
			busyTime.add(time);
		}
	}
	void deleteBusyTime(LocalDateTime time) {
		if (busyTime.contains(time)) {
			busyTime.remove(time);
		} else {
			System.out.println("Error! This time is not found");
		}
	}
	List<LocalDateTime> getBusyTime(){
		return busyTime;
	}
	
	private List<LocalDateTime> unavailableTime = new LinkedList<>();
	void addUnavailableTime(LocalDateTime time) {
		if(unavailableTime.contains(time)) {
			System.out.println("Error! Same time is already unavailable.");
		} else if(busyTime.contains(time)) {
			System.out.println("Error! This time is busy time\nFirst delete from busy time.");
		} else {
			unavailableTime.add(time);
			System.out.println("Time was added to unavailable time.");
		}
	}
	void deleteUnavailableTime(LocalDateTime time) {
		if(unavailableTime.contains(time)) {
			unavailableTime.remove(time);
			System.out.println("Time was deleted.");
		} else {
			System.out.println("Error! This time isn't unavailable.");
		}
	}
	List<LocalDateTime> getUnavailableTime(){
		return unavailableTime;
	}
	
	public String getUkrFIO() {
		String fullName = surname + " " + name.toUpperCase().toCharArray()[0] 
				+ "." + patronymic.toUpperCase().toCharArray()[0]+".";
		return fullName;
	}
	
	
}
