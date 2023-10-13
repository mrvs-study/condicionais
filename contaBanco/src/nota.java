import java.util.Scanner;
import java.util.Locale;

public class nota {
    public static void main(String[] args) {
        try (Scanner ps = new Scanner(System.in).useLocale(Locale.US)) {
            
                int media;
                System.out.println("digite sua 1 nota escolar: ");
                int nota1 = ps.nextInt();
                System.out.println("digite sua 2 nota escolar: ");
                int nota2 = ps.nextInt();

                media = (nota1 + nota2) /2;

                if (media >= 7) {
                    System.out.println("você passou com media, " +media+" parabens");
                }
                 else if (media>= 4 && media<7){
                    System.out.println("você esta de recuperação com media: "+ media);
                }
            else {
                    System.out.println("você esta reprovado(a) com media: " + media);
            }
        }
    }
    }
