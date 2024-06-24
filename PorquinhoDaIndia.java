public class PorquinhoDaIndia extends Animal {

    public PorquinhoDaIndia(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Porquinho da Índia";
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Animal: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Características: Roedor sociável e dócil, popular como animal de estimação.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O porquinho da Índia emite sons de chilrear e assobios suaves.");
    }

    @Override
    public void mover() {
        System.out.println("O porquinho da Índia movimenta-se rapidamente sobre suas patas pequenas.");
    }
}
