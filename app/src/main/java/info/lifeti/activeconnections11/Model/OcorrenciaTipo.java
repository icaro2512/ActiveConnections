package info.lifeti.activeconnections11.Model;


public class OcorrenciaTipo {
    private Integer octId;
    private String octNome;
    private Boolean octGeolocalizacao;
    private String octDescricao;

    public Integer getOctId() {
        return octId;
    }

    public void setOctId(Integer octId) {
        this.octId = octId;
    }

    public String getOctNome() {
        return octNome;
    }

    public void setOctNome(String octNome) {
        this.octNome = octNome;
    }

    public Boolean getOctGeolocalizacao() {
        return octGeolocalizacao;
    }

    public void setOctGeolocalizacao(Boolean octGeolocalizacao) {
        this.octGeolocalizacao = octGeolocalizacao;
    }

    public String getOctDescricao() {
        return octDescricao;
    }

    public void setOctDescricao(String octDescricao) {
        this.octDescricao = octDescricao;
    }
}
