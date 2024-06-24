public class Passarinho extends Animal implements Pet {

    public Passarinho(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Passarinho";
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Animal: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Características: Pequeno, Colorido, Canta melodias.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O passarinho canta melodiosamente.");
    }

    @Override
    public void mover() {
        System.out.println("O passarinho voa de forma ágil.");
    }

    @Override
    public void brincar() {
        System.out.println("O passarinho gosta de brincar com brinquedos coloridos.");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("O passarinho precisa ser cuidado com atenção de um veterinário especializado.");
    }
}
