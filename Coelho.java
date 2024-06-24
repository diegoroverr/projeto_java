public class Coelho extends Animal implements Herbivoro {

    public Coelho(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Coelho";
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Animal: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Características: Fofinho, Rápido, Alimenta-se de vegetais.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O coelho faz sons suaves para se comunicar.");
    }

    @Override
    public void mover() {
        System.out.println("O coelho corre rapidamente e dá pequenos saltos.");
    }

    @Override
    public void comerVegetais() {
        System.out.println("O coelho se alimenta de folhas, frutas e vegetais frescos.");
    }
}
