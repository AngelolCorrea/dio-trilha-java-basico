import java.util.Scanner;

public class CondicionalComposta {
    public static void main(String[] args) {
//app resultado escolar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a nota do aluno: ");
        int nota = scanner.nextInt();

            if(nota >= 7)
                System.out.println("Aprovado");
            else if (nota>=5 && nota<7)
                System.out.println("Em recuperação");
            else
            System.out.println("Reprovado");
    }
}
