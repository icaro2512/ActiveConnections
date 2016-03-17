package info.lifeti.activeconnections11.Model;


import java.io.Serializable;

public class Pais implements Serializable {
    private Integer paiId;
    private String paiNome;
    private String paiSigla;


    public Integer getPaiId() {
        return paiId;
    }

    public void setPaiId(Integer paiId) {
        this.paiId = paiId;
    }

    public String getPaiNome() {
        return paiNome;
    }

    public void setPaiNome(String paiNome) {
        this.paiNome = paiNome;
    }

    public String getPaiSigla() {
        return paiSigla;
    }

    public void setPaiSigla(String paiSigla) {
        this.paiSigla = paiSigla;
    }
}
