public class Elefante extends Animal implements Mamifero {

    public Elefante(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Elefante";
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Animal: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Características: Grande, Tromba, Vive em manadas.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O elefante emite trombeteios poderosos para se comunicar.");
    }

    @Override
    public void mover() {
        System.out.println("O elefante se desloca lentamente usando sua tromba para pegar comida.");
    }

    @Override
    public void amamentar() {
        System.out.println("A mãe elefante amamenta seu filhote com seu leite rico em nutrientes.");
    }
}
