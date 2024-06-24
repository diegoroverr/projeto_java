public class Suricato extends Animal {

    public Suricato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Suricato";
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Animal: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Características: Pequeno mamífero social, vive em grupos familiares.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O suricato emite assobios curtos para alertar o grupo.");
    }

    @Override
    public void mover() {
        System.out.println("O suricato move-se ágil e rapidamente sobre suas patas.");
    }
}
