package info.lifeti.activeconnections11.Model;


import java.io.Serializable;
import java.util.Date;

public class Ocorrencia implements Serializable {
    private Integer ocoId;
    private Date ocoDtHrInclusao;
    private Date ocoDtHrInicio;
    private Date ocoDtHrFim;
    private String ocoDescricao;
    private OcorrenciaTipo oct;
    private Usuario usu;
    private Cliente cli;
    private Servico ser;


    public Integer getOcoId() {
        return ocoId;
    }

    public void setOcoId(Integer ocoId) {
        this.ocoId = ocoId;
    }

    public Date getOcoDtHrInclusao() {
        return ocoDtHrInclusao;
    }

    public void setOcoDtHrInclusao(Date ocoDtHrInclusao) {
        this.ocoDtHrInclusao = ocoDtHrInclusao;
    }

    public Date getOcoDtHrInicio() {
        return ocoDtHrInicio;
    }

    public void setOcoDtHrInicio(Date ocoDtHrInicio) {
        this.ocoDtHrInicio = ocoDtHrInicio;
    }

    public Date getOcoDtHrFim() {
        return ocoDtHrFim;
    }

    public void setOcoDtHrFim(Date ocoDtHrFim) {
        this.ocoDtHrFim = ocoDtHrFim;
    }

    public String getOcoDescricao() {
        return ocoDescricao;
    }

    public void setOcoDescricao(String ocoDescricao) {
        this.ocoDescricao = ocoDescricao;
    }

    public OcorrenciaTipo getOct() {
        return oct;
    }

    public void setOct(OcorrenciaTipo oct) {
        this.oct = oct;
    }

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Servico getSer() {
        return ser;
    }

    public void setSer(Servico ser) {
        this.ser = ser;
    }
}
