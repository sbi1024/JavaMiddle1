package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10");
        int intValue = Integer.parseInt("10");

        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult);

        int sum = Integer.sum(10, 20);
        System.out.println("sum = " + sum);
        int min = Integer.min(10, 20);
        System.out.println("min = " + min);
        int max = Integer.max(10, 20);
        System.out.println("max = " + max);
    }
}
