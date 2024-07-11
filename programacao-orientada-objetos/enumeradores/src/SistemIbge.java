public class SistemIbge {
    public static void main(String[] args) {
        for(EstadosBrasileiros e: EstadosBrasileiros.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());

        }
        EstadosBrasileiros eb = EstadosBrasileiros.RIO_DE_JANEIRO;
        System.out.println(eb.getNome() + " - " + eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getNomeMinusculo());
    }
}
