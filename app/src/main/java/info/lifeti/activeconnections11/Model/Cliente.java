package info.lifeti.activeconnections11.Model;


import java.io.Serializable;

public class Cliente implements Serializable {
    private Integer cliId;
    private String cliRamo;
    private String cliEnquadramento;
    private String cliObservacoes;
    private Fisica fis;
    private Juridica jur;
    private String cliLogo;

    public Cliente(){

    }

    public Integer getCliId() {
        return cliId;
    }

    public void setCliId(Integer cliId) {
        this.cliId = cliId;
    }

    public String getCliRamo() {
        return cliRamo;
    }

    public void setCliRamo(String cliRamo) {
        this.cliRamo = cliRamo;
    }

    public String getCliEnquadramento() {
        return cliEnquadramento;
    }

    public void setCliEnquadramento(String cliEnquadramento) {
        this.cliEnquadramento = cliEnquadramento;
    }

    public String getCliObservacoes() {
        return cliObservacoes;
    }

    public void setCliObservacoes(String cliObservacoes) {
        this.cliObservacoes = cliObservacoes;
    }

    public Fisica getFis() {
        return fis;
    }

    public void setFis(Fisica fis) {
        this.fis = fis;
    }

    public Juridica getJur() {
        return jur;
    }

    public void setJur(Juridica jur) {
        this.jur = jur;
    }

    public String getCliLogo() {
        return cliLogo;
    }

    public void setCliLogo(String cliLogo) {
        this.cliLogo = cliLogo;
    }
}
