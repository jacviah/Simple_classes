package by.jacviah.jc1.simple_classes_counter;

public class CounterDemo {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        counter1.getNumber();
        for (int i = 0; i<6; i++) {
            counter1.increaseNumber();
            System.out.print(i + " ");
            System.out.println(counter1.getNumber());
        }

        for (int i = 0; i<12; i++) {
            counter1.decreaseNumber();
            System.out.print(i + " ");
            System.out.println(counter1.getNumber());
        }

        Counter counter2 = new Counter(8, 6, 10);
        for (int i = 0; i<4; i++) {
            counter2.increaseNumber();
            System.out.print(i + " ");
            System.out.println(counter2.getNumber());
        }
    }
}
