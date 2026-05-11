import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Você deseja criar uma conta? [S/N] ");
            String resposta = scanner.nextLine();

        if (resposta.equals("S") ){
            System.out.print("Digite o seu nome: ");
                String nome = scanner.nextLine();

            System.out.print("Digite o número da sua conta: ");
                int numconta = scanner.nextInt();

            System.out.print("Digite o número da agencia: ");
                String agencia = scanner.next();

            System.out.print("Digite o seu deposito inicial: ");
                double saldo = scanner.nextDouble();

            System.out.println("         ");
            System.out.println("         ");
            System.out.println("         ");

            System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco!");System.out.println("Sua agência é: " + agencia);
            System.out.println("Conta: " + numconta);
            System.out.println("E seu saldo de: " + saldo + " Reais já está disponível para saque");}
        else{
            System.out.println("OK, até a próxima");
        }

    }
}
