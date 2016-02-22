package info.lifeti.activeconnections11.Model;

public class Endereco {
    private Integer endId;
    private String endReferencia;
    private Integer endNum;
    private Cep cep;

    public Integer getEndId() {
        return endId;
    }

    public void setEndId(Integer endId) {
        this.endId = endId;
    }

    public String getEndReferencia() {
        return endReferencia;
    }

    public void setEndReferencia(String endReferencia) {
        this.endReferencia = endReferencia;
    }

    public Integer getEndNum() {
        return endNum;
    }

    public void setEndNum(Integer endNum) {
        this.endNum = endNum;
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }
}
