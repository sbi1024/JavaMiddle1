package lang.math.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottoNumbers = generator.generator();

        for (int lottoNumber : lottoNumbers) {
            System.out.println("lottoNumber = " + lottoNumber);
        }
    }
}
