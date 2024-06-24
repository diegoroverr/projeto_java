public class Lince extends Animal {

    public Lince(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Lince";
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Animal: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Características: Orelhas pontudas, pelagem acinzentada, cauda curta.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O lince emite um som gutural baixo.");
    }

    @Override
    public void mover() {
        System.out.println("O lince se move com agilidade, explorando seu território com cautela.");
    }
}
