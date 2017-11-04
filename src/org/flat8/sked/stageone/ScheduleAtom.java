package org.flat8.sked.stageone;

import java.time.LocalDateTime;

public class ScheduleAtom {
	LocalDateTime timeStart;
	String className;
	SchoolSubjects subject;
	String teacher;
	int room;
	
	public ScheduleAtom(LocalDateTime aTime, SchoolClass aSchoolClass, SchoolSubjects aSubject, SchoolTeacher aTeacher, SchoolRoom aRoom) {
		timeStart = aTime;
		className = aSchoolClass.getName();
		subject = aSubject;
		teacher = aTeacher.getUkrFIO();
		room = aRoom.getRoomNumber();
	}
}
