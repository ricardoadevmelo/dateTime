package exercicios.clasAtrMet.DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class conversaoDataHoraGlobalLocal {
    public static void main(String[] args) {

        //TRANSFORMANDO DATA E HORA GLOBAL PARA LOCAL

        LocalDate d04 = LocalDate.parse("2024-08-15");
        LocalDateTime d05 = LocalDateTime.parse("2024-08-15T01:25:36");
        Instant d06 = Instant.parse("2024-08-15T01:25:36Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("_______________________________");
        System.out.println("d04 = " + d04.getDayOfMonth());
        System.out.println("d04 = " + d04.getMonthValue());
        System.out.println("d04 = " + d04.getYear());
        System.out.println("_______________________________");
        System.out.println("d05 = " + d05.getHour());
        System.out.println("d05 = " + d05.getMinute());



    }
}
