import java.util.Locale;
import java.util.Scanner;

public class conta {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
        int saldo = 100;
        int sacar=0;
        System.out.println("DIGITE O VALOR DO SAQUE: ");
        int saque = scanner.nextInt();
        if (saque >100){
            System.out.println("você não possui saldo suficiente");
            System.out.println("seu saldo é de: "+saldo);
        }
        if (saque<100) {
            sacar= saldo - saque;
             System.out.println("SEU VALOR FINAL DO SALDO É: "+ sacar);
        }
       
        }
    }
}
