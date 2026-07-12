package level02.exercise04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatDateTime {

    FormatDateTime() {
    }

    public static String formatDateAndTime(LocalDateTime originalDateTime, int typeOfDateFormat) {

        String dateTimeFormattedToString = null;
        DateTimeFormatter formatter = null;

        switch(typeOfDateFormat){
            case 1: {
                formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 'at' hh:mm a").withLocale(Locale.FRANCE);
                dateTimeFormattedToString = formatter.format(originalDateTime);
                break;
            }
            case 2: {
                formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
                dateTimeFormattedToString = formatter.format(originalDateTime);
                break;
            }
            case 3: {
                formatter = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMM 'de' yyyy', a las' HH:mm:ss");
                dateTimeFormattedToString = formatter.format(originalDateTime);
                break;
            }
            default: {
                System.out.println("Invalid entry");
            }
        }
        return dateTimeFormattedToString;
    }
}

