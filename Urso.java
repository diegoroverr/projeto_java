public class Urso extends Animal implements Mamifero {

    public Urso(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Urso";
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Animal: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Características: Forte, Peludo, Hiberna no inverno.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O urso emite rugidos potentes para se comunicar.");
    }

    @Override
    public void mover() {
        System.out.println("O urso se movimenta lentamente e pode correr rapidamente quando necessário.");
    }

    @Override
    public void amamentar() {
        System.out.println("A mãe urso amamenta seus filhotes.");
    }
}
