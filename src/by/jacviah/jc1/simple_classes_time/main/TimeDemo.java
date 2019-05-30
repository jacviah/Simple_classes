package by.jacviah.jc1.simple_classes_time.main;

import by.jacviah.jc1.simple_classes_time.entity.Time;
import by.jacviah.jc1.simple_classes_time.logic.TimeLogic;

public class TimeDemo {
	
	public static void main (String[] args) {
		
		Time time = new Time(16,40,12);
		TimeLogic logic = new TimeLogic();
		
		logic.printTime(time);
		
		logic.addSecond(time, 3602);
		logic.printTime(time);		
		logic.addMinute(time, 96);
		logic.printTime(time);
		logic.addSecond(time, 62);
		logic.printTime(time);
		
	}

}
