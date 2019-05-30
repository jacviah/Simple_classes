package by.jacviah.jc1.simple_classes_train.entity;

import java.util.Objects;

public class Train {
	private String destinationName;
	private int number;
	private Time departureTime;

	public Train(String destinationName, int number, Time departureTime) {
		this.destinationName = destinationName;
		this.number = number;
		this.departureTime = departureTime;
	}

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Train train = (Train) o;
		return number == train.number &&
				Objects.equals(destinationName, train.destinationName) &&
				this.getDepartureTime().equals(train.departureTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(destinationName, number, departureTime);
	}
}
