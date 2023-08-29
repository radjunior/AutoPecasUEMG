package Model;

public class PessoaJuridica extends Pessoa{
    private int fkPessoa;
    private String cnpj;
    private String inscricaoSocial;
    private float credito;

    public int getFkPessoa() {
        return fkPessoa;
    }

    public void setFkPessoa(int fkPessoa) {
        this.fkPessoa = fkPessoa;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoSocial() {
        return inscricaoSocial;
    }

    public void setInscricaoSocial(String inscricaoSocial) {
        this.inscricaoSocial = inscricaoSocial;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }
    
}
