import java.time.LocalDate;
import java.time.LocalTime;

public class Usuario {
    private String nome;
    private int idade;
    private String email;
    private LocalDate dataVisita;
    private LocalTime horarioVisita;

    public Usuario(String nome, int idade, String email, LocalDate dataVisita, LocalTime horarioVisita) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.dataVisita = dataVisita;
        this.horarioVisita = horarioVisita;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataVisita() {
        return dataVisita;
    }

    public void setDataVisita(LocalDate dataVisita) {
        this.dataVisita = dataVisita;
    }

    public LocalTime getHorarioVisita() {
        return horarioVisita;
    }

    public void setHorarioVisita(LocalTime horarioVisita) {
        this.horarioVisita = horarioVisita;
    }
}
