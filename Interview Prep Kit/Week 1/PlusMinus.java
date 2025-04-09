import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class PlusMinus {
    public static void main(String[] args) throws IOException {

        List<Integer> arr = Stream.of(-4, 3, -9, 0, 4, 1).mapToInt(Integer::valueOf).boxed().toList();

        plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {

        int len = arr.size();
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0)
                posCount++;

            else if (arr.get(i) < 0)
                negCount++;

            else if (arr.get(i) == 0)
                zeroCount++;
        }

        double posNum = (double) posCount / len;
        double negNum = (double) negCount / len;
        double zeroNum = (double) zeroCount / len;

        System.out.format("%.6f\n", posNum);
        System.out.format("%.6f\n", negNum);
        System.out.format("%.6f\n", zeroNum);
    }

}
