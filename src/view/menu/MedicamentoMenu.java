package view.menu;


public class MedicamentoMenu {
    public static final int OP_CADASTRAR = 1;
    public static final int OP_LISTAR = 2;
    public static final int OP_VOLTAR = 0;

    public static String getOpcoes() {
        return ("\n--------------------------------------\n"
                + "1- Cadastrar Medicamentos\n"
                + "2- Listar Medicamentos\n"
                + "0- Voltar"
                + "\n--------------------------------------");
    }    
}
