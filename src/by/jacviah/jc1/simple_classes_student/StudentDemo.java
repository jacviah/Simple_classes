package by.jacviah.jc1.simple_classes_student;

public class StudentDemo {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Petrov N.B.", 234, new int[]{4, 7, 9, 6, 8});
        students[1] = new Student("Petrov T.B.", 234, new int[]{4, 7, 9, 6, 10});
        students[2] = new Student("Ivanov I.I.", 234, new int[]{6, 7, 9, 7, 8});
        students[3] = new Student("Zayceva A.P.", 236, new int[]{4, 7, 4, 6, 5});
        students[4] = new Student("Lisitca E.V.", 236, new int[]{9, 9, 9, 9, 9});
        students[5] = new Student("Smit J.J.", 237, new int[]{9, 10, 5, 6, 8});
        students[6] = new Student("Strong A.", 237, new int[]{10, 10, 9, 10, 10});
        students[7] = new Student("Napoleon B.", 238, new int[]{10, 10, 10, 10, 10});
        students[8] = new Student("Hashim. F.A", 238, new int[]{4, 10, 5, 8, 8});
        students[9] = new Student("Wenger A.", 239, new int[]{10, 10, 10, 9, 10});

        for (int i = 0; i < students.length; i++) {
            if (students[i].isExellentStudent()) {
                System.out.println(students[i].getName() + " " + students[i].getGroupNumber());
            }
        }

    }
}
