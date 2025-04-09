import java.util.ArrayList;
import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        ArrayList<String> input = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String read = sc.nextLine();
            if (read == null || read.isEmpty()) { // if the line is empty
                break; // exit the loop
            }
            input.add(read);
        }
        sc.close();

        for (int i = 0; i < input.size(); i++) {
            String inputString = input.get(i);
            returnCamelCase(inputString);
        }
    }

    public static void returnCamelCase(String input) {

        String splitOrCombine = input.substring(0, 1);
        String methodOrClassOrVariable = input.substring(2, 3);
        String name = input.substring(4);

        if (splitOrCombine.equals("S")) {

            switch (methodOrClassOrVariable) {

                case "C":
                    String[] cResultSet = name.split("(?=\\p{Upper})");
                    for (int i = 0; i < cResultSet.length; i++) {
                        System.out.print(cResultSet[i].toLowerCase().trim() + " ");
                    }
                    System.out.println();
                    break;

                case "M":
                    name = name.substring(0, name.length() - 2);
                    String[] mResultSet = name.split("(?=\\p{Upper})");
                    for (int i = 0; i < mResultSet.length; i++) {
                        System.out.print(mResultSet[i].toLowerCase().trim() + " ");
                    }
                    System.out.println();
                    break;

                case "V":
                    String[] vResultSet = name.split("(?=\\p{Upper})");
                    for (int i = 0; i < vResultSet.length; i++) {
                        System.out.print(vResultSet[i].toLowerCase().trim() + " ");
                    }
                    System.out.println();
                    break;
            }
        }

        else if (splitOrCombine.equals("C")) {

            switch (methodOrClassOrVariable) {

                case "C":
                    String[] cResultSet = name.split("\\s+");
                    for (int i = 0; i < cResultSet.length; i++) {
                        System.out.print(cResultSet[i].substring(0, 1).toUpperCase() +
                                cResultSet[i].substring(1));
                    }
                    System.out.println();
                    break;

                case "M":
                    String[] mResultSet = name.split("\\s+");
                    StringBuilder msb = new StringBuilder();
                    msb.append(mResultSet[0]);
                    for (int i = 1; i < mResultSet.length; i++) {
                        msb.append(mResultSet[i].substring(0, 1).toUpperCase() +
                                mResultSet[i].substring(1));
                    }
                    msb.append("()");
                    System.out.println(msb.toString());
                    break;

                case "V":
                    String[] vResultSet = name.split("\\s+");
                    StringBuilder vsb = new StringBuilder();
                    vsb.append(vResultSet[0]);
                    for (int i = 1; i < vResultSet.length; i++) {
                        vsb.append(vResultSet[i].substring(0, 1).toUpperCase() +
                                vResultSet[i].substring(1));
                    }
                    System.out.println(vsb.toString());
                    break;
            }
        }
    }
}