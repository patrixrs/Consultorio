package consultorio;


public class Paciente {
    private String rg, nome, dataNascimento;

    public Paciente(String rg, String nome, String dataNascimento) {
        this.rg = rg;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Paciente{" + "rg=" + rg + ", nome=" + nome + ", dataNascimento=" + dataNascimento + '}';
    }
    
    
}
