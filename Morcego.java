public class Morcego extends Animal implements Mamifero {

    public Morcego(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Morcego";
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Animal: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Características: Noturno, Voa, Alimenta-se de insetos.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O morcego emite sons ultrasônicos para se orientar e comunicar.");
    }

    @Override
    public void mover() {
        System.out.println("O morcego voa silenciosamente à noite em busca de comida.");
    }

    @Override
    public void amamentar() {
        System.out.println("A mãe morcego amamenta seu filhote.");
    }
}
