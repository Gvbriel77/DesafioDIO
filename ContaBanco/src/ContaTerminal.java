import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" Nome do Cliente: ");
            String nome = sc.nextLine();

            System.out.print("\n");
                System.out.print(" Digite o sua Agencia: ");
                String Agencia = sc.nextLine();
        
        
                    System.out.print("\n");
                    System.out.print(" Digite o numero da sua Conta: ");
                    int NumConta = sc.nextInt();

                

                            System.out.print("\n");
                            System.out.print(" Qual o valor do deposito: R$");
                            double Deposito = sc.nextDouble();

                                    System.out.print("\n");
                                    System.out.println("    Ola " + nome +" Obrigado por criar uma conta em nosso banco!");
                                    System.out.println(" Abaixo os dados da sua conta.");
                                    System.out.println(" Numero da Conta: " + NumConta);
                                    System.out.println(" Agencia: " + Agencia);
                                    System.out.println(" Saldo : R$" + Deposito);


        



    }
}
