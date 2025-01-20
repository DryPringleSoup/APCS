import java.math.BigInteger;
import java.util.stream.IntStream;

public class Perfects {
    public static void main(String[] args) {
        // Bit-wise transformation I used comes from Euler's formula for perfect numbers: (2**(p-1)) * (2**p - 1)
        // 6: 110, 28: 11100, 496: 111110000, 8128: 1111111000000, ...
        IntStream.of(2,3,5,7,13,17,19,31).mapToObj(p -> {
                        BigInteger one = BigInteger.ONE;
                        BigInteger result = one.shiftLeft(p).subtract(one).shiftLeft(p - 1);
                        return result;
                    }).forEach(System.out::println);
    }
}