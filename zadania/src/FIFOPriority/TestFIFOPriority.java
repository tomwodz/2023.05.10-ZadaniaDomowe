package FIFOPriority;

public class TestFIFOPriority {
    public static void main(String[] args) {
        FIFOPriority fifo = FIFOPriority.getInstance();

        fifo.push("String 10", 10);
        fifo.push("String 40", 40);
        fifo.push("String 30", 30);
        fifo.push("String 99", 99);
        fifo.push("String 50", 50);
        fifo.push("String 60", 60);
        fifo.push("String 87", 87);
        fifo.push("String 70", 70);
        fifo.push("String 99", 99);
        fifo.push("String 77", 70);
        fifo.push("String 95", 95);
        fifo.push("String 98", 98);
        fifo.push("String 66", 66);


        System.out.println(fifo.popHighThree());

        System.out.println("********************************");

        System.out.println(fifo.popFirst());
        System.out.println(fifo.popFirst());

        System.out.println("********************************");

        System.out.println(fifo.popHighest());
        System.out.println(fifo.popHighest());
        System.out.println(fifo.popHighest());

    }
}
