import java.io.IOException;

public class TimeConversion {
    public static void main(String[] args) throws IOException {

        String s = "06:40:03AM";

        String result = timeConversion(s);

        System.out.println(result);
    }

    public static String timeConversion(String s) {
        // Write your code here
        StringBuilder finalTime = new StringBuilder();

        String tod = s.substring(s.length() - 2);

        if (tod.equals("AM") && s.substring(0, 2).equals("12"))
            finalTime.append("00").append(s.substring(2, 8));

        else if (tod.equals("PM") && s.substring(0, 2).equals("12"))
            finalTime.append(s.substring(0, 8));

        else if (tod.equals("AM"))
            finalTime.append(s.substring(0, 8));

        else if (tod.equals("PM")) {
            int hour = Integer.parseInt(s.substring(0, 2)) + 12;
            finalTime.append(hour).append(s.substring(2, 8));
            // if(hour < 24)
            // finalTime.append(hour).append(s.substring(2,8));
            // else{
            // hour = hour - 24;
            // finalTime.append(hour).append(s.substring(2,8));
            // }
        }

        return finalTime.toString();
    }

}
