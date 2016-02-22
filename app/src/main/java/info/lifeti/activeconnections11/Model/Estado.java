package info.lifeti.activeconnections11.Model;

public class Estado {
    private Integer estId;
    private String estNome;
    private String estUf;
    private Pais pai;

    public Integer getEstId() {
        return estId;
    }

    public void setEstId(Integer estId) {
        this.estId = estId;
    }

    public String getEstNome() {
        return estNome;
    }

    public void setEstNome(String estNome) {
        this.estNome = estNome;
    }

    public String getEstUf() {
        return estUf;
    }

    public void setEstUf(String estUf) {
        this.estUf = estUf;
    }

    public Pais getPai() {
        return pai;
    }

    public void setPai(Pais pai) {
        this.pai = pai;
    }
}
