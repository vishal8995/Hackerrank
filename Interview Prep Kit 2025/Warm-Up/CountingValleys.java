import java.util.Arrays;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int valleys = 0, route = 0;
        char[] ch = path.toCharArray();

        for (int i = 0; i < steps; i++) {

            if ('U' == (ch[i]))
                route += 1;
            else
                route += -1;

            if (route == 0 && 'U' == ch[i])
                valleys++;
        }

        return valleys;
    }

    public static void main(String[] args) {
        String path = "UDDDUDUU";
        int steps = 8;
        System.out.println(countingValleys(steps, path));
    }
}
