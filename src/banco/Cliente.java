package banco;

public class Cliente {
    private String nome;
    private String cpf;
    private String datadenascimento;
    public Cliente(String nome, String cpf, String datadenascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.datadenascimento = datadenascimento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDatadenascimento() {
        return datadenascimento;
    }
    public void setDatadenascimento(String datadenascimento) {
        this.datadenascimento = datadenascimento;
    }
}
