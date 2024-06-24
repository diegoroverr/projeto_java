import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersistenciaDados {

    private static final String ARQUIVO_USUARIOS = "usuarios.txt";
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

    public static void salvarUsuario(Usuario usuario) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARQUIVO_USUARIOS, true))) {
            writer.println(usuarioParaString(usuario));
        } catch (IOException e) {
            System.err.println("Erro ao salvar usuário: " + e.getMessage());
        }
    }

    public static List<Usuario> carregarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        try (Scanner scanner = new Scanner(PersistenciaDados.class.getResourceAsStream("/" + ARQUIVO_USUARIOS))) {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                usuarios.add(stringParaUsuario(linha));
            }
        } catch (Exception e) {
            System.err.println("Erro ao carregar usuários: " + e.getMessage());
        }
        return usuarios;
    }

    private static String usuarioParaString(Usuario usuario) {
        return usuario.getNome() + ";" +
               usuario.getIdade() + ";" +
               usuario.getEmail() + ";" +
               (usuario.getDataVisita() != null ? DATE_FORMATTER.format(usuario.getDataVisita()) : "") + ";" +
               (usuario.getHorarioVisita() != null ? TIME_FORMATTER.format(usuario.getHorarioVisita()) : "");
    }

    private static Usuario stringParaUsuario(String linha) {
        String[] partes = linha.split(";");
        String nome = partes[0];
        int idade = Integer.parseInt(partes[1]);
        String email = partes[2];
        LocalDate dataVisita = partes[3].isEmpty() ? null : LocalDate.parse(partes[3], DATE_FORMATTER);
        LocalTime horarioVisita = partes.length > 4 && !partes[4].isEmpty() ? LocalTime.parse(partes[4], TIME_FORMATTER) : null;
        return new Usuario(nome, idade, email, dataVisita, horarioVisita);
    }
}
