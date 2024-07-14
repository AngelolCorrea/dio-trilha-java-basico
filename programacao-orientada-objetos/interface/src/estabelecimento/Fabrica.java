package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.DeskJet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.LaserJet;
import equipamentos.multiFuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultiFuncional multi = new EquipamentoMultiFuncional();
        Impressora impressora = multi;
        Digitalizadora digitalizadora = multi;
        Copiadora copiadora = multi;


        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
}
}
