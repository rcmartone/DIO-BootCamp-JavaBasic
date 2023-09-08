package desafios.ContaBanco;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta!");
        int numberAccount = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agency = scanner.next();

        System.out.println("Por favor, digite o nome do cliente!");
        String clientName = scanner.next();

        System.out.println("Por favor, digite o saldo em conta!");
        float balance = scanner.nextFloat();

        System.out.println("Olá " + clientName + " obrigado por criar uma conta em nosso banco, sua agência é " + agency + " conta " + numberAccount + " e seu saldo de " + balance + " já está disponível para saque.");
    }
}
