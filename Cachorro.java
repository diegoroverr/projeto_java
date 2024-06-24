public class Cachorro extends Animal implements Pet, Mamifero {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Cachorro";
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Animal: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Características: Leal, Amigável, Brincalhão.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro emite sons como latidos e uivos.");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro corre e pula com agilidade.");
    }

    @Override
    public void brincar() {
        System.out.println("O cachorro adora brincar com seu dono.");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("O cachorro precisa ser levado ao veterinário regularmente.");
    }

    @Override
    public void amamentar() {
        // Implementação específica de mamífero (não aplicável para cachorro)
    }
}
