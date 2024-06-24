public class UrsoPolar extends Animal implements Mamifero {

    public UrsoPolar(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Urso Polar";
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Animal: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Características: Pelagem branca, Adaptado ao frio, Excelente nadador.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O urso polar produz rugidos profundos para se comunicar.");
    }

    @Override
    public void mover() {
        System.out.println("O urso polar nada habilmente e caminha sobre o gelo.");
    }

    @Override
    public void amamentar() {
        System.out.println("A mãe urso polar amamenta seu filhote.");
    }
}
