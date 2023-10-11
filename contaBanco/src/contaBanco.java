import java.util.Locale;
import java.util.Scanner;

public class contaBanco {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("digite seu nome: ");
            String nome = scanner.nextLine();
            System.out.println("Seu nome é?: " + nome);
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                System.out.println("continue seu processo normalmente" + "\n");
            }
            System.out.println("Por favor, nos informe seu numero da conta: ");
            String numero = scanner.nextLine();
            System.out.println("seu numero de conta é?: " + numero);
            String resposta1 = scanner.nextLine();
            if (resposta1.equalsIgnoreCase("s")) {
                System.out.println("continue seu processo normalmente" + "\n");
            }
            System.out.println("digite o seu numero de agencia: ");
            String agencia = scanner.nextLine();
            System.out.println("o numero da agencia é?: " + agencia);
            String resposta2 = scanner.nextLine();
            if (resposta2.equalsIgnoreCase("s")) {
                System.out.println("continue seu processo normalmente" + "\n");
            }
            System.out.println(
                    "seu nome é: " + nome + "seu numero da conta é: " + numero + "seu numero da agencia é: " + agencia);
            System.out.println("seus dados estão corretos?(S/N) ");
            String resposta3 = scanner.nextLine();
            if (resposta3.equalsIgnoreCase("s"))
                ;
            System.out.println("Projeto encerrado");
        }
    }
}
