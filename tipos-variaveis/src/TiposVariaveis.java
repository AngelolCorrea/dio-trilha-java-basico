public class TiposVariaveis {
    public static void main(String[] args) {
        //EStudar tipos primitivos e a classe STRING que representa texto na aplicação

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //usado cast para garantir a precisão da informação do número.


        //o que fazer para o valor da variável_nunca_mudar ?

        int numero =1;
        numero = 2;
        System.out.println("Valor da variável número: " + numero);

        final double VALOR_DE_PI = 3.14; // inserindo "final" a variável não aceita troca de valor
        //VALOR_DE_PI = 10.75;

        System.out.println("Valor de PI é: " + VALOR_DE_PI);

        String meuNome = "Angelo";
        System.out.println("Meu nome é: " +meuNome);

    }

}