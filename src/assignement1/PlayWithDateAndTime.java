package assignement1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertEquals;
public class PlayWithDateAndTime {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime tenSecondsLater = now.plusSeconds(10);

        LocalDate endDate = LocalDate.parse("2021-12-19");
        LocalDate currentDate = LocalDate.parse("2020-12-18");

        double noOfDays = currentDate.until(endDate, ChronoUnit.DAYS);
        System.out.println(noOfDays);


        long diff = now.until(tenSecondsLater, ChronoUnit.SECONDS);
        System.out.println(diff);
        assertEquals(10, diff);
    }
}
