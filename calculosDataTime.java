package exercicios.clasAtrMet.DateTime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class calculosDataTime {
    public static void main(String[] args) {
        // CALCULOS COM DATA

        LocalDate d04 = LocalDate.parse("2024-08-15");
        LocalDateTime d05 = LocalDateTime.parse("2024-08-15T01:25:36");
        Instant d06 = Instant.parse("2024-08-15T01:25:36Z");
        System.out.println("---------------------------");

        LocalDate menosDias = d04.minusDays(7);
        LocalDate maisDias = d04.plusDays(7);
        System.out.println("Diminuir dias = " + menosDias);
        System.out.println("Aumentar dias = " + maisDias);
        System.out.println("---------------------------");

        LocalDateTime diminuirDias = d05.minusDays(7);
        LocalDateTime aumentarDias = d05.plusDays(7);
        System.out.println("Diminuir dias = " + diminuirDias);
        System.out.println("Aumentar dias = " + aumentarDias);
        System.out.println("---------------------------");

        Instant instantMenosDias = d06.minus(7, ChronoUnit.DAYS);
        Instant instantMaisDias = d06.plus(7, ChronoUnit.DAYS);
        System.out.println("Diminuir dias = " + instantMenosDias);
        System.out.println("Diminuir dias = " + instantMaisDias);

        System.out.println("---------------------------");
        // DURACAO ENTRE DATAS E HORAS
        // Duration t1 = Duration.between(menosDias.atTime(0, 0), d04.atTime(0, 0));
        Duration t1 = Duration.between(menosDias.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(diminuirDias, d05);
        Duration t3 = Duration.between(instantMenosDias, d06);

        System.out.println("Duracao t1: " + t1.toDays());
        System.out.println("Duracao t2: " + t2.toDays());
        System.out.println("Duracao t3: " + t3.toDays());

    }
}
