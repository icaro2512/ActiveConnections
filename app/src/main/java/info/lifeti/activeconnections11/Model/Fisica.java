package info.lifeti.activeconnections11.Model;


import java.io.Serializable;

public class Fisica implements Serializable {
    private Integer fisId;
    private String fisPrimeiroNome;
    private String fisNomeMeio;
    private String fisSobrenome;
    private String fisRg;
    private String fisCpf;
    private Pessoa pes;

    public Integer getFisId() {
        return fisId;
    }

    public void setFisId(Integer fisId) {
        this.fisId = fisId;
    }

    public String getFisPrimeiroNome() {
        return fisPrimeiroNome;
    }

    public void setFisPrimeiroNome(String fisPrimeiroNome) {
        this.fisPrimeiroNome = fisPrimeiroNome;
    }

    public String getFisNomeMeio() {
        return fisNomeMeio;
    }

    public void setFisNomeMeio(String fisNomeMeio) {
        this.fisNomeMeio = fisNomeMeio;
    }

    public String getFisSobrenome() {
        return fisSobrenome;
    }

    public void setFisSobrenome(String fisSobrenome) {
        this.fisSobrenome = fisSobrenome;
    }

    public String getFisRg() {
        return fisRg;
    }

    public void setFisRg(String fisRg) {
        this.fisRg = fisRg;
    }

    public String getFisCpf() {
        return fisCpf;
    }

    public void setFisCpf(String fisCpf) {
        this.fisCpf = fisCpf;
    }

    public Pessoa getPes() {
        return pes;
    }

    public void setPes(Pessoa pes) {
        this.pes = pes;
    }
}
