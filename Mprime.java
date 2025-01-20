import java.math.BigInteger;
import java.util.stream.IntStream;

public class Mprime {
    public static void main(String[] args) {
        IntStream.of(2,3,5,7,13,17,19,31).mapToObj(p -> {
                        BigInteger one = BigInteger.ONE;
                        BigInteger result = one.shiftLeft(p).subtract(one);
                        return result;
                    }).forEach(System.out::println);
    }
}