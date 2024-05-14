import java.util.Scanner;

public class ContaTerminal {
  
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        // Solicitar número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Consumir a nova linha deixada pelo nextInt
        scanner.nextLine();

        // Solicitar a agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicitar o nome do cliente
        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.nextLine();

        // Solicitar o saldo da conta
        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        // Exibir mensagem final com as informações coletadas
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);

        scanner.close();
    }
    
}
