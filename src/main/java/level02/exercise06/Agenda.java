package level02.exercise06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.List;

import java.util.stream.Collectors;


public class Agenda {
    List<LocalDateTime> appointments = List.of(
            LocalDateTime.of(2026, 5, 22, 9, 30),
            LocalDateTime.of(2026, 7, 4, 10, 45),
            LocalDateTime.of(2025, 12, 30, 16, 10),
            LocalDateTime.of(2026, 8, 12, 18, 40),
            LocalDateTime.of(2027, 1, 17, 8, 0)
            );

    public Agenda(){
    }

    public List<LocalDateTime> getNextAppointments(){
        LocalDateTime today = LocalDateTime.now();
        return this.appointments.stream().filter(element -> {return element.isAfter(today);}).collect(Collectors.toList());
    }

    public void showNextAppointments(){
        List<LocalDateTime> nextAppointments = getNextAppointments();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 'at' hh:mm a");
        LocalDateTime today = LocalDateTime.now();

        nextAppointments.forEach(element -> {System.out.format("%s\n", formatter.format(element));});
    }
}
