package info.lifeti.activeconnections11.Model;


import java.util.Date;

public class Servico {
    private Integer serId;
    private String serNome;
    private String serDescricao;
    private Date serDtHrInicio;
    private Date serDtHrFim;
    private Double serValor;
    private ServicoTipo set;

    public Integer getSerId() {
        return serId;
    }

    public void setSerId(Integer serId) {
        this.serId = serId;
    }

    public String getSerNome() {
        return serNome;
    }

    public void setSerNome(String serNome) {
        this.serNome = serNome;
    }

    public String getSerDescricao() {
        return serDescricao;
    }

    public void setSerDescricao(String serDescricao) {
        this.serDescricao = serDescricao;
    }

    public Date getSerDtHrInicio() {
        return serDtHrInicio;
    }

    public void setSerDtHrInicio(Date serDtHrInicio) {
        this.serDtHrInicio = serDtHrInicio;
    }

    public Date getSerDtHrFim() {
        return serDtHrFim;
    }

    public void setSerDtHrFim(Date serDtHrFim) {
        this.serDtHrFim = serDtHrFim;
    }

    public Double getSerValor() {
        return serValor;
    }

    public void setSerValor(Double serValor) {
        this.serValor = serValor;
    }

    public ServicoTipo getSet() {
        return set;
    }

    public void setSet(ServicoTipo set) {
        this.set = set;
    }
}
