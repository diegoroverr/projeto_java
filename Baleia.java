public class Baleia extends Animal implements Mamifero {

    public Baleia(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Baleia";
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Animal: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Características: Gigante, Aquático, Alimenta-se de krill e peixes.");
    }

    @Override
    public void emitirSom() {
        System.out.println("A baleia emite sons complexos e melodiosos para se comunicar.");
    }

    @Override
    public void mover() {
        System.out.println("A baleia nada majestosamente nos oceanos.");
    }

    @Override
    public void amamentar() {
        System.out.println("A mãe baleia amamenta seu filhote com leite rico em gordura.");
    }
}
