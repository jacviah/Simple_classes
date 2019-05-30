package by.jacviah.jc1.simple_classes_airline.entity;

import java.util.Objects;

public class Airline {
    private String destinationName;
    private int number;
    private AirType type;
    private Time departureTime;
    private Day day;

    public Airline(String destinationName, int number, AirType type, Day day, Time departureTime) {
        this.destinationName = destinationName;
        this.number = number;
        this.type = type;
        this.departureTime = departureTime;
        this.day = day;
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

    public AirType getType() {
        return type;
    }

    public void setType(AirType type) {
        this.type = type;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return number == airline.number &&
                Objects.equals(destinationName, airline.destinationName) &&
                type == airline.type &&
                Objects.equals(departureTime, airline.departureTime) &&
                day == airline.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationName, number, type, departureTime, day);
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destinationName='" + destinationName + '\'' +
                ", number=" + number +
                ", type=" + type +
                ", departureTime=" + departureTime.toString() +
                ", day=" + day +
                '}';
    }
}
