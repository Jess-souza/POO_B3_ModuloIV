package stream;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contato {
    private Integer id;
    private String nome;
    private LocalDate dataDeNascimento;

    private Long idade;

    private String telefone;

    public Contato() {
    }

    public Contato(int id, String nome, LocalDate dataDeNascimento, Long idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.idade = idade;
        this.telefone = telefone;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Long getIdade() {
        return idade;
    }

    public void setIdade(Long idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", nascimento=" + dataDeNascimento +
                ", idade=" + idade +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
