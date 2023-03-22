import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); sc.useLocale(Locale.US);

        String agencia, nomeCliente;
        int numero;
        float saldo;

        System.out.println("Informe o número da sua conta: ");
        numero = sc.nextInt();

        System.out.println("Informe o número da sua agência:");
        agencia = sc.next();

        System.out.println("Informe o seu nome completo: ");
        nomeCliente = sc.next();

        System.out.println("Informe seu saldo: ");
        sc.nextLine();
        saldo = sc.nextFloat();

        System.out.println("Olá, " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco. Sua agência é "
                +agencia+ ", conta " +numero+ " e seu saldo R$"+saldo+
                " já está disponível para saque.");
    }
}