import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        

        //CRIANDO O OBJETO SCANNER
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o seu nome:");
        String nome = scanner.next();

        System.out.println("Por favor, informe a sua a sua agência:");
        String agencia = scanner.next();

        System.out.println("Agora digite o número da Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("E por fim informe o seu saldo bancário:");        
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco."); 
        System.out.println("Sua agência é "+agencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque.");
     
    }
}
