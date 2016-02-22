package info.lifeti.activeconnections11.Model;

public class Cep {
    private Integer cepId;
    private String cepNumero;
    private String cepEndereco;
    private String cepComplemento;
    private String cepLogradouro;
    private Double cepLatitude;
    private Double cepLongitude;
    private Bairro bai;

    public Integer getCepId() {
        return cepId;
    }

    public void setCepId(Integer cepId) {
        this.cepId = cepId;
    }

    public String getCepNumero() {
        return cepNumero;
    }

    public void setCepNumero(String cepNumero) {
        this.cepNumero = cepNumero;
    }

    public String getCepEndereco() {
        return cepEndereco;
    }

    public void setCepEndereco(String cepEndereco) {
        this.cepEndereco = cepEndereco;
    }

    public String getCepComplemento() {
        return cepComplemento;
    }

    public void setCepComplemento(String cepComplemento) {
        this.cepComplemento = cepComplemento;
    }

    public String getCepLogradouro() {
        return cepLogradouro;
    }

    public void setCepLogradouro(String cepLogradouro) {
        this.cepLogradouro = cepLogradouro;
    }

    public Double getCepLatitude() {
        return cepLatitude;
    }

    public void setCepLatitude(Double cepLatitude) {
        this.cepLatitude = cepLatitude;
    }

    public Double getCepLongitude() {
        return cepLongitude;
    }

    public void setCepLongitude(Double cepLongitude) {
        this.cepLongitude = cepLongitude;
    }

    public Bairro getBai() {
        return bai;
    }

    public void setBai(Bairro bai) {
        this.bai = bai;
    }
}
