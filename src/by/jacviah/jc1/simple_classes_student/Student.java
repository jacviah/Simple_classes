package by.jacviah.jc1.simple_classes_student;

public class Student {
    private String name;
    private int groupNumber;
    private int[] performance = new int[5];

    public Student(String name, int groupNumber, int[] performance) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.performance = performance;
    }

    public boolean isExellentStudent() {
        boolean flag = true;
        int[] x = this.getPerformance();
        for (int j = 0; j < x.length; j++) {
            if (x[j] < 9) {
                flag = false;
            }
        }
        return flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getPerformance() {
        return performance;
    }

    public void setPerformance(int[] performance) {
        this.performance = performance;
    }

}
