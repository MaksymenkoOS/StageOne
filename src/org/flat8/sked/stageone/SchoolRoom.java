package org.flat8.sked.stageone;

import java.util.LinkedList;
import java.util.List;

public class SchoolRoom {
	private int roomNumber;
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	private int numberOfSeats;
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	private List<SchoolSubjects> subjectDirection = new LinkedList<>();
}
