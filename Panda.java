public class Panda extends Animal {

    public Panda(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Panda";
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Animal: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Características: Pelagem preta e branca, alimenta-se principalmente de bambu.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O panda emite vocalizações suaves e grunhidos.");
    }

    @Override
    public void mover() {
        System.out.println("O panda move-se lentamente, caminhando e escalando árvores.");
    }
}
