public class Tigre extends Animal implements Carnivoro {

    public Tigre(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Tigre";
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Animal: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Características: Feroz, Listras, Excelente caçador.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O tigre ruge alto para intimidar presas e se comunicar.");
    }

    @Override
    public void mover() {
        System.out.println("O tigre se movimenta silenciosamente e corre rapidamente para caçar.");
    }

    @Override
    public void cacar() {
        System.out.println("O tigre caça grandes presas como cervos e búfalos.");
    }
}
