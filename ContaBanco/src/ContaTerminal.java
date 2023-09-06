import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o número da sua agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.print("Por favor, digite o seu saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.print(
            "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
            ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque."
            );
    }
    
}
