import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao Banco DIO!");

        int ag;
        String conta;
        String nome;
        String valor;

        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, digite sua agência: ");
        ag = ler.nextInt();
       
        System.out.println("Digite sua conta para prosseguirmos: ");
        conta = ler.nextLine();
        conta = ler.nextLine();

        System.out.println("Precisamos confirmar seu nome completo, por favor, digite seu nome completo: ");
        nome = ler.nextLine();

        System.out.println("Qual o investumento inicial da sua conta?: ");
        valor = ler.nextLine();

        /*System.out.println("Seus dados e informações de conta são: ");
        System.out.println("Agência: "+ag);
        System.out.println("Conta: "+ conta);
        System.out.println("Nome do cliente: "+ nome);
        System.out.println("Valor inicial investido: "+ valor);*/

        System.out.println("Olá " + nome + " obrigado por criar a conta em nosso banco, sua agência é "+ ag + " conta "+ conta + " e seu saldo "+valor + " já está disponível para saque.");
       

    }

}

