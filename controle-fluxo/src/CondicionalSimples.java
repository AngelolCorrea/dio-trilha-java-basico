import java.util.Scanner;

public class CondicionalSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 25.00;
        System.out.println("Bem vindo, seu saldo é: " +saldo);
        System.out.println("Qual valor deseja sacar? ");
        double valorSolicitado = scanner.nextDouble();

            if (valorSolicitado < saldo) {
                saldo = saldo - valorSolicitado;
                System.out.println("Seu novo saldo é: " + saldo);
                //implementação de composta
            }else
                System.out.println("Saldo insuficiente");



    }
}
