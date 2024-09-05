package nested.local;

public class LocalOuterV2 {
    private int outInstanceVar = 3;

    public void process(int pramVar) {
        int localVar = 1;


        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("pramVar = " + pramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV1 = new LocalOuterV2();
        localOuterV1.process(2);
    }
}
