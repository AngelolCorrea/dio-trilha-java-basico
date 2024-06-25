import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor bruto do salário: ");
        float salarioBruto = scanner.nextFloat();
        System.out.println("Digite o valor dos beneficios: ");
        float valorBeneficios = scanner.nextFloat();

        float valorImposto = 0;
        if (salarioBruto >=0 && salarioBruto <= 1100){
            valorImposto = 0.05f * salarioBruto;
        } else if (salarioBruto > 1100 && salarioBruto <= 2500) {
            valorImposto = 0.10f * salarioBruto;
        } else {
           valorImposto = 0.15f * salarioBruto;
        }

        float saida = salarioBruto - valorImposto + valorBeneficios;
        System.out.println("O total a receber será de R$" + saida);
        System.out.println("O imposto total descontado foi de R$" +valorImposto);

    }

}
