import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private List<Animal> animais;
    private List<Usuario> usuarios;
    private Scanner scanner;

    public Main() {
        animais = new ArrayList<>();
        inicializarAnimais();
        usuarios = PersistenciaDados.carregarUsuarios(); // Carregar usuários do arquivo
        scanner = new Scanner(System.in);
    }

    private void inicializarAnimais() {
        animais.add(new Cachorro("Rex", 5));
        animais.add(new Gato("Mimi", 3));
        animais.add(new Elefante("Dumbo", 10));
        animais.add(new Papagaio("Louro", 2));
        animais.add(new Tigre("Rajah", 4));
        animais.add(new Urso("Baloo", 8));
        animais.add(new Morcego("Draco", 3));
        animais.add(new Macaco("George", 3));
        animais.add(new Coelho("Bugs", 2));
        animais.add(new Golfinho("Flipper", 15));
        animais.add(new UrsoPolar("Snowy", 6));
        animais.add(new Baleia("Willy", 20));
        animais.add(new Leopardo("Leapy", 6));
        animais.add(new Lince("Whiskers", 4));
        animais.add(new Panda("Bamboo", 12));
        animais.add(new Orangotango("Chico", 9));
        animais.add(new Suricato("Timon", 3));
        animais.add(new PorquinhoDaIndia("Pipoca", 1));
    }

    public void mostrarMenu() {
        int opcao;

        do {
            exibirCabecalho();

            System.out.println("Escolha uma opção:");
            System.out.println("1. Listar animais");
            System.out.println("2. Listar usuários");
            System.out.println("3. Cadastrar usuário");
            System.out.println("4. Sair");
            System.out.print("Digite o número correspondente à sua escolha: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    listarAnimais();
                    break;
                case 2:
                    listarUsuarios();
                    break;
                case 3:
                    cadastrarUsuario();
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 4);
        
        scanner.close();
    }

    private void exibirCabecalho() {
        System.out.println("=================================================");
        System.out.println("          Bem-vindo ao Mundo dos Animais          ");
        System.out.println("=================================================");
    }

    private void listarAnimais() {
        int opcao;

        do {
            System.out.println("Lista de Animais:");
            for (int i = 0; i < animais.size(); i++) {
                System.out.println((i + 1) + ". " + animais.get(i).getTipo());
            }
            System.out.println((animais.size() + 1) + ". Voltar ao menu principal\n");

            System.out.print("Digite o número correspondente à sua escolha: ");
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            if (opcao > 0 && opcao <= animais.size()) {
                exibirDecorado(animais.get(opcao - 1));
                System.out.print("Pressione Enter para continuar...");
                scanner.nextLine(); // Esperar o usuário pressionar Enter
            } else if (opcao != animais.size() + 1) {
                System.out.println("Opção inválida. Tente novamente.");
                System.out.print("Pressione Enter para continuar...");
                scanner.nextLine(); // Esperar o usuário pressionar Enter
            }

        } while (opcao != animais.size() + 1);
    }

    private void listarUsuarios() {
        System.out.println("Lista de Usuários:");
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = usuarios.get(i);
            System.out.println((i + 1) + ". Nome: " + usuario.getNome());
            System.out.println("   Idade: " + usuario.getIdade());
            System.out.println("   E-mail: " + usuario.getEmail());
            System.out.println("   Data da Visita: " + (usuario.getDataVisita() != null ? usuario.getDataVisita().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) : "Não informada"));
            System.out.println("   Horário da Visita: " + (usuario.getHorarioVisita() != null ? usuario.getHorarioVisita().format(DateTimeFormatter.ofPattern("HH:mm")) : "Não informado"));
            System.out.println("------------------------------------------");
        }
        System.out.println("Pressione Enter para voltar ao menu principal...");
        scanner.nextLine(); // Esperar o usuário pressionar Enter
    }

    private void exibirDecorado(Animal animal) {
        System.out.println("=================================================");
        System.out.println("             Características do " + animal.getTipo());
        System.out.println("=================================================");
        animal.mostrarCaracteristicas();
        animal.emitirSom();
        animal.mover();
        System.out.println("=================================================");
    }

    private void cadastrarUsuario() {
        System.out.println("Cadastro de Usuário:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        System.out.print("Data da visita (dd/MM/yyyy): ");
        LocalDate dataVisita = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.print("Horário da visita (HH:mm): ");
        LocalTime horarioVisita = LocalTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("HH:mm"));

        Usuario usuario = new Usuario(nome, idade, email, dataVisita, horarioVisita);
        PersistenciaDados.salvarUsuario(usuario);
        usuarios.add(usuario);

        System.out.println("Usuário cadastrado com sucesso!");
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine(); // Esperar o usuário pressionar Enter
    }

    public static void main(String[] args) {
        Main programa = new Main();
        programa.mostrarMenu();
    }
}
