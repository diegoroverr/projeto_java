public class Leopardo extends Animal {

    public Leopardo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Leopardo";
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Animal: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Características: Ágil, manchas (rosetas) na pelagem, excelente caçador.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O leopardo emite um rugido forte.");
    }

    @Override
    public void mover() {
        System.out.println("O leopardo se move silenciosamente, com passos furtivos.");
    }
}
