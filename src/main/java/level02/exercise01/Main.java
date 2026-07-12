package level02.exercise01;

public class Main {

    public static void main(String[] args) {
        System.out.format("%1$td-%1$tm-%1$tY\n", DateAndTime.getCurrentLocalDate());
        System.out.format("%tT\n", DateAndTime.getCurrentLocalTime());
        System.out.format("%1$td-%1$tm-%1$tY at %tT\n", DateAndTime.getCurrentLocalDateTime());
    }
}
