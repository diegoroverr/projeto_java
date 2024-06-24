public class Macaco extends Animal implements Mamifero, Pet {

    public Macaco(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Macaco";
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Animal: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Características: Ágil, Vive em bandos, Omnívoro.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O macaco emite gritos e vocalizações para se comunicar com o grupo.");
    }

    @Override
    public void mover() {
        System.out.println("O macaco se balança habilmente de árvore em árvore.");
    }

    @Override
    public void amamentar() {
        System.out.println("A mãe macaco amamenta seu filhote.");
    }

    @Override
    public void brincar() {
        System.out.println("O macaco adora brincar e se pendurar em galhos.");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("Os macacos precisam de cuidados veterinários para garantir sua saúde.");
    }
}
