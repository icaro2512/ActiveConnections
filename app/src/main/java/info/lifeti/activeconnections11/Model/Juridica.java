package info.lifeti.activeconnections11.Model;


public class Juridica {
    private Integer jurId;
    private String jurNomeFantasia;
    private String jurRazaoSocial;
    private String jurCnpj;
    private String jurInscricaoEstadual;
    private String jurInscricaoMunicipal;
    private Cidade cid; //Código IBGE
    private Pessoa pes;

    public Integer getJurId() {
        return jurId;
    }

    public void setJurId(Integer jurId) {
        this.jurId = jurId;
    }

    public String getJurNomeFantasia() {
        return jurNomeFantasia;
    }

    public void setJurNomeFantasia(String jurNomeFantasia) {
        this.jurNomeFantasia = jurNomeFantasia;
    }

    public String getJurRazaoSocial() {
        return jurRazaoSocial;
    }

    public void setJurRazaoSocial(String jurRazaoSocial) {
        this.jurRazaoSocial = jurRazaoSocial;
    }

    public String getJurCnpj() {
        return jurCnpj;
    }

    public void setJurCnpj(String jurCnpj) {
        this.jurCnpj = jurCnpj;
    }

    public String getJurInscricaoEstadual() {
        return jurInscricaoEstadual;
    }

    public void setJurInscricaoEstadual(String jurInscricaoEstadual) {
        this.jurInscricaoEstadual = jurInscricaoEstadual;
    }

    public String getJurInscricaoMunicipal() {
        return jurInscricaoMunicipal;
    }

    public void setJurInscricaoMunicipal(String jurInscricaoMunicipal) {
        this.jurInscricaoMunicipal = jurInscricaoMunicipal;
    }

    public Cidade getCid() {
        return cid;
    }

    public void setCid(Cidade cid) {
        this.cid = cid;
    }

    public Pessoa getPes() {
        return pes;
    }

    public void setPes(Pessoa pes) {
        this.pes = pes;
    }
}
