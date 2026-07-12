package level02.exercise04;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        LocalDateTime unformattedDateAndTime = LocalDateTime.now();
        System.out.format("%s\n", unformattedDateAndTime);

        System.out.format("%s\n", FormatDateTime.formatDateAndTime(unformattedDateAndTime, 1));
        System.out.format("%s\n", FormatDateTime.formatDateAndTime(unformattedDateAndTime, 2));
        System.out.format("%s\n", FormatDateTime.formatDateAndTime(unformattedDateAndTime, 3));
    }
}
