public class Gato extends Animal implements Pet {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Gato";
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Animal: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Características: Ágil, Independente, Gosta de carinho.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato mia suavemente para se comunicar.");
    }

    @Override
    public void mover() {
        System.out.println("O gato se movimenta silenciosamente e salta com destreza.");
    }

    @Override
    public void brincar() {
        System.out.println("O gato brinca com seus brinquedos favoritos.");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("O gato precisa de cuidados veterinários regulares.");
    }
}
