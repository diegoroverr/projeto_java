public class Papagaio extends Animal implements Pet {

    public Papagaio(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Papagaio";
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Animal: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Características: Colorido, Fala, Vive em bando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O papagaio emite sons variados e pode imitar vozes humanas.");
    }

    @Override
    public void mover() {
        System.out.println("O papagaio voa com agilidade e se movimenta entre árvores.");
    }

    @Override
    public void brincar() {
        System.out.println("O papagaio brinca com objetos coloridos e pode aprender truques.");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("O papagaio precisa de uma dieta equilibrada e cuidados com penas e bico.");
    }
}
