public abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract String getTipo();

    public abstract void mostrarCaracteristicas();

    public abstract void emitirSom();

    public abstract void mover();
}
