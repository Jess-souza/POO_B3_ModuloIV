package stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MainExercicioStream {

    public static void main(String[] args) {

        LocalDate nascimentoCate = LocalDate.parse("1977-04-15");
        LocalDate nascimentoJulia = LocalDate.parse("2001-01-13");
        LocalDate nascimentoJessica = LocalDate.parse("1998-06-15");

        List<Contato> contatoList = new ArrayList<>();
        Contato cate = new Contato(1, "Cate", nascimentoCate, 45l, "323 432423");
        Contato julia = new Contato(2, "Julia", nascimentoJulia, 21l, "48937 43543");
        Contato jessica = new Contato(3, "Jess", nascimentoJessica, 24l, "234034 432");
        contatoList.add(cate);
        contatoList.add(julia);
        contatoList.add(jessica);

        //Some todas as idades
        System.out.println("Soma todas idades:");
        Stream<Contato> contatoStream = contatoList.stream();
        Long totalIdades = contatoStream
                .map(contato -> contato.getIdade())
                .reduce(0l, (subtotal, valor) -> subtotal + valor);
        System.out.println("Total de idades: " + totalIdades);
        System.out.println("\n _____________________________ \n");

        //Filtre por data de nascimento
        System.out.println("Filtra por data de nascimento:");
        Stream<Contato> nascimentoStream = contatoList.stream();
        nascimentoStream
                .filter(contato ->
                        //boolean isNascimento = contato.getDataDeNascimento().isEqual(LocalDate.parse("1977-04-15"));
                        // return isNascimento;
                        contato.getDataDeNascimento().isEqual(LocalDate.parse("1977-04-15"))
                ).forEach(System.out::println);
        // contatoStream.forEach(contato ->{
        //   System.out.println("Nome: " +contato.getNome());});
        System.out.println("\n _____________________________ \n");

        //Pesquise por nome ou id
        System.out.println("Pesquisa por nome ou Id:");
        Stream<Contato> nomeIdStream = contatoList.stream();
        nomeIdStream
                .filter(contato -> {
                    boolean isNome = contato.getNome().equals("Julia");
                    boolean isId = contato.getId().equals(3);
                    return isNome || isId;
                }).forEach(System.out::println);
        System.out.println("\n _____________________________ \n");

        //Ordene por nome
        System.out.println("Ordena por nome:");
        Stream<Contato> ordemCrescenteStream = contatoList.stream();
        ordemCrescenteStream
                .sorted(Comparator.comparing(Contato::getNome))
                .forEach(System.out::println);
        System.out.println("\n _____________________________ \n");

        //Mostre a pessoa mais velha e mais nova
        System.out.println("Mostre a pessoa mais velha e mais nova:");
        Stream<Contato> maisVelhaStream = contatoList.stream();
        var value2  = maisVelhaStream.max(Comparator.comparing(Contato::getIdade));
        if (value2.isPresent()) {
            System.out.println("Pessoa mais velha: " + value2.get().toString());
        }
        Stream<Contato> maisNovaStream = contatoList.stream();
        var value = maisNovaStream.min(Comparator.comparing(Contato::getIdade));
        if (value.isPresent()) {
            System.out.println("Pessoa mais nova: " + value.get().toString());
        }
    }
}




