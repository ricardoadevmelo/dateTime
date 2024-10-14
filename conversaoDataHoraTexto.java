package exercicios.clasAtrMet.DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class conversaoDataHoraTexto {
    public static void main(String[] args) {
        //TRANSFORMANDO DATA E HORA PARA TEXTO
        LocalDate d04 = LocalDate.parse("2024-08-15");
        LocalDateTime d05 = LocalDateTime.parse("2024-08-15T01:25:36");
        Instant d06 = Instant.parse("2024-08-15T01:25:36Z"); //Lembrando q o "instant" nao tem o 'format' pois nao eh data local!


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // pois vai depender do fuso horario, p imprimir data/hora mundial, tenho q especificar o fuso horario, logo:
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;


        System.out.println("d04.1: " + d04); // nao imprime o formato correto da data
        System.out.println("d04.2: " + d04.format(fmt1)); // imprime o formato correto da data
        System.out.println("d04.3: " + fmt1.format(d04)); // tambem pode ser nesse formato mesmo resultado
        System.out.println("d04.4: " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // outra forma sem botar em variavel
        System.out.println();
        System.out.println("d05.1: " + d05.format(fmt1));
        System.out.println("d05.2: " + d05.format(fmt2));
        // System.out.println("d06: " + d06.format(fmt1));//Lembrando q o "instant" nao tem o 'format' pois nao eh data local!
        System.out.println("d06: " + fmt3.format(d06));
        System.out.println("d06.1: " + fmt3.format(d06));
        System.out.println("d06.2: " + fmt5.format(d06));
    }
}
