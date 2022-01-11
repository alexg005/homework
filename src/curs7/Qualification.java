package curs7;

public class Qualification extends Teacher {
	public Qualification(int experienceYears, String course, String schedule ) {
		this.setExperienceYears(experienceYears);
		this.setCourse(course);
		this.setSchedule(schedule);
	}
	
	public void verify() {
		if(experienceYears > 3 && course.equals("Java") && schedule.equals("Afternoon")) {
			System.out.println("You qualify to teach at this school!");
		} else {
			System.out.println("You do not qualify!");
		}
	}
}
