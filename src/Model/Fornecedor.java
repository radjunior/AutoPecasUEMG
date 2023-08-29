package Model;

public class Fornecedor extends Pessoa {
    private int fkPessoa;
    private int idPessoa;
    private String Cnpj;
    private String inscricaoSocial;
    private String ramoAtividade;

    public String getInscricaoSocial() {
        return inscricaoSocial;
    }

    public void setInscricaoSocial(String inscricaoSocial) {
        this.inscricaoSocial = inscricaoSocial;
    }

    public String getRamoAtividade() {
        return ramoAtividade;
    }

    public void setRamoAtividade(String ramoAtividade) {
        this.ramoAtividade = ramoAtividade;
    }

    public int getFkPessoa() {
        return fkPessoa;
    }

    public void setFkPessoa(int fkPessoa) {
        this.fkPessoa = fkPessoa;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }

    @Override
    public String toString() {
        return getNome(); //To change body of generated methods, choose Tools | Templates.
    }
}