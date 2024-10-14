package exercicios.clasAtrMet.DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciandoDataHora {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("Date: " + date);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date and Time: " + dateTime);

        Instant instant = Instant.now();
        System.out.println("Instant: " + instant);

        LocalDate localDateParse = LocalDate.parse("2024-08-15");
        System.out.println("Local Date Time passando uma data: " + localDateParse);
        LocalDateTime localDateTimeParse = LocalDateTime.parse("2024-08-15T01:25:36");
        System.out.println("Local Date Time passando uma data: " + localDateTimeParse);
        // se quiser formatar a data e hora para o formato ISO, basta acrescentar .toString();

        Instant instantPadraoIso = Instant.parse("2024-08-15T01:25:36Z");
        System.out.println("Local Date Time passando uma data ISO: " + instantPadraoIso);
        Instant instantPadraoIsoParaLocal = Instant.parse("2024-08-15T01:25:36-03:00");
        System.out.println("Local Date Time passando uma data ISO para local: " + instantPadraoIsoParaLocal);

        // LocalDate localDate = LocalDate.parse("30/08/2024");
        // System.out.println("Data local passando uma data usual: " + localDate); // da erro de excecao
        // para eu imprimir a data customizada, temos q dizer como eh o formato e usar o comando: "dateTimeFormat"
        // temos q instanciar a formatacao da data, assim sendo:
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate1 = LocalDate.parse("30/08/2024", dateTimeFormatter1);
        System.out.println("Imprimir a formatacao da data fora no padrao usual: " + localDate1);
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime localDate2 = LocalDateTime.parse("30/08/2024 13:40", dateTimeFormatter2);
        System.out.println("Imprimir texto formatado com a data e hora: " + localDate2);
        // outro modo de instanciar imprimir data eh usando o "of"
        LocalDate ld = LocalDate.of(2024,8,30);
        System.out.println("imprimir data usando o `of`: " + ld);
        LocalDateTime lDt = LocalDateTime.of(2024, 8, 30, 14, 9);
        System.out.println("imprimir data e hora usando o `of`: " + lDt);

    }
}
