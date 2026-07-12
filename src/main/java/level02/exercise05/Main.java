package level02.exercise05;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LocalDate passedDate = LocalDate.of(1919, 10, 5);

        System.out.format("%b", DateAndTime.isPassedDate(passedDate));

    }
}
