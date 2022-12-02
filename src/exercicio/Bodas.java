package exercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

//Romeu é um romântico que quer um programa que salve a data de casamento dele e uma segunda data e depois mostre as bodas que ele estará na segunda data:
//
//        1 ano – Bodas de Papel
//        5 anos – Bodas de Madeira ou Ferro
//        10 anos – Bodas de Estanho
//        15 anos – Bodas de Cristal
//        30 anos – Bodas de Pérola
//        40 anos – Bodas de Esmeralda
//        50 anos – Bodas de Ouro

public class Bodas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a data de casamento:");
        var dataCasamento = input.nextLine();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataCasamentoFormatada = LocalDate.parse(dataCasamento, formatoData);

        System.out.println("Digite a outra data:");
        var outraData = input.nextLine();
        LocalDate outraDataFormatada = LocalDate.parse(outraData, formatoData);
        var bodas = (int) ChronoUnit.YEARS.between(dataCasamentoFormatada, outraDataFormatada);

        if (bodas >= 1 && bodas < 5) {
            System.out.println("Bodas de papel");
        } else if (bodas < 10) {
            System.out.println("Bodas de madeira ou ferro");
        } else if (bodas < 15) {
            System.out.println("Bodas de estanho");
        } else if (bodas < 30) {
            System.out.println("Bodas de cristal");
        } else if (bodas < 40) {
            System.out.println("Bodas de pérola");
        } else if (bodas < 50) {
            System.out.println("Bodas de esmeralda");
        } else {
            System.out.println("Bodas de ouro");
        }
    }
}
