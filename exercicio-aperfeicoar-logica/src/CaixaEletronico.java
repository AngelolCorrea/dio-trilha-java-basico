import java.sql.SQLOutput;
import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("Escolha a opção desejada: ");
            System.out.println("1 - DEPÓSITO");
            System.out.println("2 - SAQUE");
            System.out.println("3 - COLSULTAR SALDO");
            System.out.println("4 - ENCERRAR");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor que irá depositar R$ ");
                    double depositado = scanner.nextDouble();
                    saldo += depositado;
                    System.out.println("O novo saldo é R$ "+saldo);
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado R$ ");
                    double saque = scanner.nextDouble();
                    if (saque > saldo){
                        System.out.println("Você não possui saldo suficiente");
                    }else
                        saldo -= saque;
                    System.out.println("Valor sacado R$ " +saque +"Saldo restante R$ " +saldo);
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    break;
                case 3:
                    System.out.println("O saldo atual da conta é R$ " +saldo);
                    // TODO: Exibir o saldo atual da conta.
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}