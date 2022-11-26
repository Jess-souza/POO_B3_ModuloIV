package exercicio;
//Escreva um script que leia duas datas e mostre a quantidade de horas entre elas

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DiferencaDeDatas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a primeira data: ");
        String date1 = sc.nextLine();
        System.out.print("Informe a segunda data: ");
        String date2 = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        var begins = LocalDate.parse(date1, formatter);
        var ends = LocalDate.parse(date2, formatter);

        long days = ChronoUnit.DAYS.between(begins, ends);
        var duration = Duration.ofDays(days);

        System.out.print("A diferença entre as duas datas em horas é: " + duration.toHours());
    }
}