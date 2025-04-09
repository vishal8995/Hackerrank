import java.util.*;

public class JumpingOnTheClouds {

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int jump = 1;

        for (int i = 2; i < c.size() - 1; i += 2) {
            if (c.get(i) == 1) {
                i--;
            }
            jump++;
        }

        return jump;
    }

    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>(Arrays.asList(0, 1, 0, 0, 0, 1, 0));
        System.out.println(jumpingOnClouds(c));
    }

}
