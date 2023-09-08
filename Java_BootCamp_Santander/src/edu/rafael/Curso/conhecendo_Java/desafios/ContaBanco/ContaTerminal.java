package edu.rafael.Curso.conhecendo_Java.desafios.ContaBanco;
import java.util.Scanner;

/**
* <h1>ContaBanco</h1>
* A ContaBanco realiza a busca de parametros como número da conta,
* a agência do cliente, o nome do cliente e por fim, um saldo, 
*gerando assim uma mensagem final que organiza e exibi os parâmetros em
*uma estrutura visual ordenada.
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes.
*
* @author  Rafael Camacho
* @version 1.0
* @since   08/09/2023
*/
public class ContaTerminal {
     /**
    * @param numberAccount Pede o número da conta do cliente.
    * @param agency Pede o número da agência do cliente.
    * @param clienteName Pede o nome do cliente.
    * @param balance Pede um saldo ao cliente como exemplo.
    */
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe scanner
        try (Scanner scanner = new Scanner(System.in)){
             //TODO: Exibir as mensagens ao usuario em seguida do uso do scanner
        System.out.println("Por favor, digite o número da conta!");
        int numberAccount = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agency = scanner.next();

        System.out.println("Por favor, digite o nome do cliente!");
        String clientName = scanner.next();

        System.out.println("Por favor, digite o saldo em conta!");
        float balance = scanner.nextFloat();

        //TODO: Exibição da mensagem final com a conta criada
        System.out.println("Olá " + clientName + " obrigado por criar uma conta em nosso banco, sua agência é " + agency + " conta " + numberAccount + " e seu saldo de " + balance + " já está disponível para saque.");
        
        } catch (Exception e) {
            // TODO: handle exception - Em caso de erros
        }
        /*O metodo try-with-resources garante a correção de erros e tem o metodo
        * close embutido para fechar os scanners em execução.
         */
       
    }
}
