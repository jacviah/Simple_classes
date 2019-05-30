package by.jacviah.jc1.simple_classes_book.entity;

public enum BindingType {
    //(8-80 Pages)
    SADDLE_STITCHED("Saddle Stitched"),
    //(8-80 Pages)
    LOOP_STITCHED("Loop Stitched"),
    //(2-300 Pages)
    STAB_STITCHED("Stab Stitched or Side Stitched Binding"),
    //(8-24 Pages)
    SEWN_BOUND("Sewn Bound"),
    //(50-250 Pages)
    PERFECT_BOUND("Perfect Bound"),
    //(50-250 Pages)
    TAPE_BOUND("Tape Bound"),
    //(16-400 Pages)
    SCREW_BOUND("Screw Bound"),
    //(60-400 Pages)
    CASE_BOUND("Hardcover or Case Bound"),
    //(2-250 Pages)
    PLASTIC_GRIP("Plastic Grip"),
    //(2-250 Pages)
    COMB_BOUND("Comb Bound or Plastic Bound"),
    //(16-275 Pages)
    SPIRAL_BOUND("Spiral Bound or Coil Bound"),
    //(16-275 Pages)
    WIRE_BOUND("Wire Bound");

    private final String val;

    private BindingType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}
