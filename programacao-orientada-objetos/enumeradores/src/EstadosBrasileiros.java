public enum  EstadosBrasileiros {
    SAO_PAULO("SP", "SAO PAULO",11),
    RIO_DE_JANEIRO("RJ", "RIO DE JANEIRO",12),
    PIAUI("PI", "PIAUI",13),
    MARANHAO("MA", "MARANHAO",14),
    CEARA("CE", "CEARA",15)
    ;

    private String nome;
    private String sigla;
    private int ibge;

    private EstadosBrasileiros(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }

    public String getNomeMinusculo(){
        return nome.toLowerCase();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
