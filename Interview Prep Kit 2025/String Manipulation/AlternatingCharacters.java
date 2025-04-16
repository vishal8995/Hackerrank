public class AlternatingCharacters {

    public static int alternatingCharacters(String s) {
        // Write your code here
        int ctr = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                ctr++; // Found a repeat, needs deletion
            }
        }
        return ctr;

    }

    public static void main(String[] args) {

        System.out.println(alternatingCharacters("AAAA"));
        System.out.println(alternatingCharacters("ABABABAB"));
        System.out.println(alternatingCharacters("AAABBB"));
    }
}
