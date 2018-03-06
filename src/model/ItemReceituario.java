package model;


public class ItemReceituario {
    private Medicamento medicamento;
    private String posologia;

    public ItemReceituario(Medicamento medicamento, String posologia) {
        this.medicamento = medicamento;
        this.posologia = posologia;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public String getPosologia() {
        return posologia;
    }

    @Override
    public String toString() {
        return medicamento.getNome()+" - "+posologia;
    }
    
    
}
