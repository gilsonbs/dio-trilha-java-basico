import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
                      
        System.out.println("Por Favor, digite o número da Agencia");
        String Agencia = scanner.nextLine();
    
        System.out.println("Por Favor, digite o número da Conta!");
        int Numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por Favor, digite seu nome!");
        String NomeCliente = scanner.nextLine();
        

        System.out.println("Por Favor, digite seu sobrenome!");
        String sobreNomeCliente = scanner.nextLine();

        System.out.println("Por Favor, quanto voce deseja depositar?");
        Float Saldo = scanner.nextFloat();

        System.out.println("Olá " + NomeCliente + " " + sobreNomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + " conta " + Numero + " e seu saldo R$ " + Saldo + " já está disponivel para saque!");
    
    }
}
