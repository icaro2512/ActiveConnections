package info.lifeti.activeconnections11.Model;

import java.io.Serializable;

public class PessoaEndereco implements Serializable {
    private Pessoa pes;
    private Endereco end;
    private String peeStatus;
    private String peeDescricao;

    public Pessoa getPes() {
        return pes;
    }

    public void setPes(Pessoa pes) {
        this.pes = pes;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
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
