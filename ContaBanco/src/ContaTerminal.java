import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        
        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.next(); 

        
        scanner.nextLine(); 

       
        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine(); 

        
        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

       
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua conta possui os seguintes dados:");
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Número da agência: " + agencia);
        System.out.println("Saldo: R$" + saldo);

       
        scanner.close();
    }
}
