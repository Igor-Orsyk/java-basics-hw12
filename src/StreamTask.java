import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTask {

    public static void main(String[] args) {

        int [] test = new int[]{5, -3, 11, -5};
        System.out.println(getSortedOddsArray(test));

    }

    public static int getSumSquareEven(int[] numbers) {
        // TODO replace return with your code
        return Arrays.stream(numbers)
                .filter( element -> element % 2 == 0)
                .reduce(0, (subtotal, element) -> element * element + subtotal);
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        return (int[]) Arrays.stream(numbers)
                .filter( a -> a % 2 != 0)
                .sorted()
                .toArray();
    }
}
