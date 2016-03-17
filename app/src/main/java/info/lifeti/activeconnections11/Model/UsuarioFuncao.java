package info.lifeti.activeconnections11.Model;


import java.io.Serializable;

public class UsuarioFuncao implements Serializable {
    private Integer usfId;
    private String usfNome;
    private String usfDescricao;
    private String usfStatus;

    public Integer getUsfId() {
        return usfId;
    }

    public void setUsfId(Integer usfId) {
        this.usfId = usfId;
    }

    public String getUsfNome() {
        return usfNome;
    }

    public void setUsfNome(String usfNome) {
        this.usfNome = usfNome;
    }

    public String getUsfDescricao() {
        return usfDescricao;
    }

    public void setUsfDescricao(String usfDescricao) {
        this.usfDescricao = usfDescricao;
    }

    public String getUsfStatus() {
        return usfStatus;
    }

    public void setUsfStatus(String usfStatus) {
        this.usfStatus = usfStatus;
    }
}
