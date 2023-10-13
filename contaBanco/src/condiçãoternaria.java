import java.util.Locale;
import java.util.Scanner;

public class condiçãoternaria {
    public static void main(String[] args) {
        try (Scanner mk = new Scanner (System.in).useLocale(Locale.US)){
System.out.println("digite sua primeira nota: ");
int nota1 = mk.nextInt();
System.out.println("digite sua segunda nota");
int nota2 = mk.nextInt();
int soma = (nota1 + nota2) /2;
String resultado = soma >=7 ? "aprovado" : soma>=5 && soma<7 ? "recuperação" : "reprovado";
 System.out.println("você esta "+resultado);
        }
    }
}
