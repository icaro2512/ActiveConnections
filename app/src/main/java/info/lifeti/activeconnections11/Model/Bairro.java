package info.lifeti.activeconnections11.Model;

import java.io.Serializable;

public class Bairro implements Serializable {
    private Integer baiId;
    private String baiNome;
    private String baiAbrev;
    private Cidade cid;

    public Bairro(Integer baiId, String valor) {
        this.baiId = baiId;
    }

    public Bairro() {
    }

    public Integer getBaiId() {
        return baiId;
    }

    public void setBaiId(Integer baiId) {
        this.baiId = baiId;
    }

    public String getBaiNome() {
        return baiNome;
    }

    public void setBaiNome(String baiNome) {
        this.baiNome = baiNome;
    }

    public String getBaiAbrev() {
        return baiAbrev;
    }

    public void setBaiAbrev(String baiAbrev) {
        this.baiAbrev = baiAbrev;
    }

    public Cidade getCid() {
        return cid;
    }

    public void setCid(Cidade cid) {
        this.cid = cid;
    }



}
