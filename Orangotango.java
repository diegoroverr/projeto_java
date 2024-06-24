public class Orangotango extends Animal {

    public Orangotango(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Orangotango";
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Animal: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Características: Pelagem avermelhada, braços longos, vive em árvores.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O orangotango emite vocalizações altas e variadas.");
    }

    @Override
    public void mover() {
        System.out.println("O orangotango move-se habilmente por entre os galhos das árvores.");
    }
}
