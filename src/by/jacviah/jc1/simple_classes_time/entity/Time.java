package by.jacviah.jc1.simple_classes_time.entity;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		if (second >= 0 & second < 60) {
			this.second = second;
		} else {
			this.second = 0;
		}
		if (minute >= 0 & minute < 60) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}
		if (hour >= 0 & hour < 24) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour >= 0 & hour < 24) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute >= 0 & minute < 60) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second >= 0 & second < 60) {
			this.second = second;
		} else {
			this.second = 0;
		}
	}



}
