public class Operadores {
    public static void main(String[] args) {
        //String nomeCompleto = "Linguagem " + "Java";
        //System.out.println(nomeCompleto);

        //qual o resultado das expressoes abaixo?

        //~ String concatenacao ="?";

        //concatenacao = 1+1+1+"1";
        //System.out.println(concatenacao);

        //concatenacao = 1+"1"+1+1;
        //System.out.println(concatenacao);

        //concatenacao = 1+"1"+1+"1";
        //System.out.println(concatenacao);

        //concatenacao = "1"+1+1+1;
        //System.out.println(concatenacao);

        //concatenacao = "1"+(1+1+1);
        //System.out.println(concatenacao);
        // -------------------------------------------------------------------------

        //Tornando números positivo e negativo.
        //int numero = 5;
        //System.out.println(- numero);
        //numero = - numero;

        //System.out.println(numero);

        //numero = numero * -1; //tornando um numero negativo em positivo.
        //System.out.println(numero);
        // ------------------------------------------------------------------

        //Incremento e repetição.
        int numero = 5;
        //x repetição

        //System.out.println(numero);
        //System.out.println(++ numero);
        //System.out.println(numero);
        //---------------------------------------------------------------------

        //Negar expressões booleanas.
        //boolean variavel = true;
        //variavel = !variavel; //inverte o valor da booleana
        //System.out.println(variavel);
        //----------------------------------------------------------------------

        //Operador ternário

        int a, b;

        a = 5;
        b = 6;
        //String resultado = "";

        //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        /*    if(a==b)
         resultado = "verdadeiro";
            else
         resultado = "falso";

        System.out.println(resultado);
         */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO

        /*String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado);*/

        /*String nome1 = "Angelo";
        //String nome2 = "Correa";
        String nome2 = new String("Angelo");

        System.out.println(nome1 == nome2);
        System.out.println(nome1.equals(nome2)); //equals compara conteudo


        int numero1 = 1;
        int numero2 = 2;

        if (numero1 < numero2){
            System.out.println("A nossa condição é verdadeira!");
        }*/

        /*boolean simNao = numero1 == numero2;
        System.out.println("Numero 1 é igual ao numero 2?; " + simNao);
        simNao = numero1 != numero2;
        System.out.println("Numero 1 é diferente do numero 2?: " + simNao);
        simNao = numero1 < numero2;
        System.out.println("Numero 1 é menor que numero 2?; " + simNao);
        simNao = numero1 > numero2;
        System.out.println("NUmero 1 é maior que numero 2?: " + simNao);*/
        //----------------------------------------------------------------------------

        //Operadores lógicos
        boolean condicao1=true;

        boolean condicao2=false;

/* Aqui estamos utilizando o operador lógico E para fazer a união de duas
expressões.
É como se estivesse escrito:
 "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
*/

       /* if(condicao1 && (7>4))
            System.out.print("Os dois valores precisam ser verdadeiros");
        System.out.println("fim");

//Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.print("Uma do valores é verdadeiro");*/


    }
}
