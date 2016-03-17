package info.lifeti.activeconnections11.Model;


import java.io.Serializable;

public class PessoaContato implements Serializable {
    private Pessoa pes1;
    private Pessoa pes2;
    private String peeStatus;
    private String peeDescricao;

    public Pessoa getPes1() {
        return pes1;
    }

    public void setPes1(Pessoa pes1) {
        this.pes1 = pes1;
    }

    public Pessoa getPes2() {
        return pes2;
    }

    public void setPes2(Pessoa pes2) {
        this.pes2 = pes2;
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
