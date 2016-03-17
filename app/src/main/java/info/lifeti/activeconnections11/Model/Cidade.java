package info.lifeti.activeconnections11.Model;

import java.io.Serializable;

public class Cidade implements Serializable {
    private Integer cidId;
    private String cidNome;
    private String cidCodIbge;
    private Estado est;

    public Integer getCidId() {
        return cidId;
    }

    public void setCidId(Integer cidId) {
        this.cidId = cidId;
    }

    public String getCidNome() {
        return cidNome;
    }

    public void setCidNome(String cidNome) {
        this.cidNome = cidNome;
    }

    public String getCidCodIbge() {
        return cidCodIbge;
    }

    public void setCidCodIbge(String cidCodIbge) {
        this.cidCodIbge = cidCodIbge;
    }

    public Estado getEst() {
        return est;
    }

    public void setEst(Estado est) {
        this.est = est;
    }
}
