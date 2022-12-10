package stream;

import java.time.LocalDate;
import java.util.ArrayList;
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

        Stream<Contato> contatoStream = contatoList.stream();

        Long totalIdades = contatoStream
                .map(contato -> contato.getIdade())
                .reduce(0l, (subtotal, valor) -> subtotal + valor);
        System.out.println("Total de idades: " + totalIdades);

        Stream<Contato> nascimentoStream = contatoList.stream();
        nascimentoStream
                .filter(contato ->
                        //boolean isNascimento = contato.getDataDeNascimento().isEqual(LocalDate.parse("1977-04-15"));
                        // return isNascimento;
                        contato.getDataDeNascimento().isEqual(LocalDate.parse("1977-04-15"))
                ).forEach(System.out::println);
        // contatoStream.forEach(contato ->{
        //   System.out.println("Nome: " +contato.getNome());});


        Stream<Contato> nomeIdStream = contatoList.stream();
        nomeIdStream
                .filter(contato -> {
                    boolean isNome = contato.getNome().equals("Julia");
                    boolean isId = contato.getId().equals(3);
                    return isNome || isId;
                }).forEach(System.out::println);
    }
}




