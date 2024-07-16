import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"));
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        // => "You have an appointment on Friday, March 29, 2019, at 3:00 PM."
        String date = appointmentDate.format(DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy,"));
        String time = appointmentDate.format(DateTimeFormatter.ofPattern("h:mm a")).toUpperCase();
        return "You have an appointment on " + date + " at " + time + ".";
        
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
