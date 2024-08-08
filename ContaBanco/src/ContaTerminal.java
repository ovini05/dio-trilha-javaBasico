import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o numero da sua conta: ");
        int conta = sc.nextInt();

        System.out.print("Digite o numero de sua agencia: ");
        String agencia = sc.next();
        
        System.out.print("Digite seu nome: ");
        String cliente = sc.next();
        

        System.out.print("Qual seu saldo atual: ");
        double saldo = sc.nextDouble();


        System.out.println("Ola " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é" + agencia + ", " + conta + " e seu saldo " + saldo + " ja esta disponivel para saque." );




        sc.close();
    }
}


