package by.jacviah.jc1.simple_classes_train.entity;

import java.util.Objects;

public class Time implements Cloneable{
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

	public int compareTo (Time time) {
		if (this.getHour() != time.getHour()) {
			return this.getHour() - time.getHour();
		} else if (this.getMinute()!= time.getMinute()) {
			return this.getHour() - time.getHour();
		} else return this.getSecond() - time.getSecond();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Time time = (Time) o;
		return hour == time.hour &&
				minute == time.minute &&
				second == time.second;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute, second);
	}

	@Override
	public String toString() {
		return "Time{" +
				"hour=" + hour +
				", minute=" + minute +
				", second=" + second +
				'}';
	}
}
