package exercicio;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

// Ex 00 - Cronômetro
// Faça um programa que aperte a letra A e depois a B e informe quanto tempo em segundo passou.
public class Cronograma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a letra A");
        String A = sc.nextLine();
        var horaLetraA = LocalTime.now();


        System.out.println("Digite a letra B");
        String B = sc.nextLine();
        var horaLetraB = LocalTime.now();


        long seconds = ChronoUnit.SECONDS.between(horaLetraA, horaLetraB);
        Duration duration = Duration.ofSeconds(seconds);
        System.out.println("Duracao do intervalo: " + duration);

    }
}
