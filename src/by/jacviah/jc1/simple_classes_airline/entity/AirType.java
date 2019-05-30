package by.jacviah.jc1.simple_classes_airline.entity;

public enum AirType {
    WIDE("Wide-body"),
    NARROW("Narrow-body"),
    REGIONAL("Regional"),
    LIGHT("Light");

    private final String val;

    private AirType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}
