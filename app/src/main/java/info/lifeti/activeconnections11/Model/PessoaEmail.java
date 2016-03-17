package info.lifeti.activeconnections11.Model;

import java.io.Serializable;

public class PessoaEmail implements Serializable {
    private Pessoa pes;
    private Email ema;
    private String peeStatus;
    private String peeDescricao;

    public Pessoa getPes() {
        return pes;
    }

    public void setPes(Pessoa pes) {
        this.pes = pes;
    }

    public Email getEma() {
        return ema;
    }

    public void setEma(Email ema) {
        this.ema = ema;
    }

    public String getPeeStatus() {
        return peeStatus;
    }

    public void setPeeStatus(String peeStatus) {
        this.peeStatus = peeStatus;
    }

    public String getPeeDescricao() {
        return peeDescricao;
    }

    public void setPeeDescricao(String peeDescricao) {
        this.peeDescricao = peeDescricao;
    }
}
