package level01.exercise01;

public class Calendar {

    public Calendar(){
    }
    public static String determineWeekendOrWeekDay(Day day){
        String typeOfDay;
        if(day.equals(Day.SATURDAY) || day.equals(Day.SUNDAY)){
            typeOfDay = "Weekend";
        } else {
            typeOfDay = "Weekday";
        }
        return typeOfDay;
    }
}
