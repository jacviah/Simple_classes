package by.jacviah.jc1.simple_classes_counter;

import java.util.Objects;

public class Counter {
    private int number;
    private int min;
    private int max;

    Counter() {
        this.number = 5;
        this.min = 0;
        this.max = 10;
    }

    Counter(int number, int min, int max) {
        this.number = number;
        this.min = min;
        this.max = max;
    }

    public int getNumber() {
        return number;
    }

    public void decreaseNumber() {
        if (number > min) {
            this.number--;
        }
    }

    public void increaseNumber() {
        if (number < max) {
            this.number++;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Counter counter = (Counter) o;
        return number == counter.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Counter{" +
                "number=" + number +
                '}';
    }
}
