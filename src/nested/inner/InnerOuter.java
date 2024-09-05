package nested.inner;

public class InnerOuter {
    private static int outClassValue = 3;
    private int outInsstanceValue = 2;

    class Inner {
        private int innerInstanceValue = 1;

        public void print() {
            System.out.println(innerInstanceValue);
            System.out.println(outInsstanceValue);
            System.out.println(outClassValue);
        }
    }
}
