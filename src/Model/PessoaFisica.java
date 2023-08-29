package Model;

public class PessoaFisica extends Pessoa{
    private int fkPessoa;
    private String cpf;
    private String rg;
    private float credito;

    public int getFkPessoa() {
        return fkPessoa;
    }

    public void setFkPessoa(int fkPessoa) {
        this.fkPessoa = fkPessoa;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }
    
}
