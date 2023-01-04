import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

class test {
    public static void main(String args[]) {
        LocalTime time = LocalTime.parse("08:19:44");
        LocalTime time1 = LocalTime.parse("23:34:44");
        System.out.println(time.until(time1, ChronoUnit.HOURS));
    }
}
