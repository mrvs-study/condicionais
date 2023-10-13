import java.util.Locale;
import java.util.Scanner;

public class sistemademedidacomswitchcase {
    public static void main(String[] args) {
        try (Scanner mk = new Scanner(System.in).useLocale(Locale.US)) {
            String sigla = mk.nextLine();
            //caso onde o switch case não é tão viavel de ser usado
            switch (sigla) {
                case "P": {
                    System.out.println("pequena");
                    break;
                }

                case "M": {
                    System.out.println("medio");
                    break;
                }
                case "G": {
                    System.out.println("grande");
                    break;
                }
                default: {
                    System.out.println("INDEFINIDO");
                }
            }
        }
    }
}
