public class Golfinho extends Animal implements Mamifero {

    public Golfinho(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Golfinho";
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Animal: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Características: Aquático, Inteligente, Brincalhão.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O golfinho emite sons agudos e melodiosos.");
    }

    @Override
    public void mover() {
        System.out.println("O golfinho nada rapidamente e salta na água.");
    }

    @Override
    public void amamentar() {
        
    }
}
