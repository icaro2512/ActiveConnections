package info.lifeti.activeconnections11.Model;


import java.io.Serializable;

public class Telefone  implements Serializable {
    private Integer telId;
    private String telNumero;

    public Integer getTelId() {
        return telId;
    }

    public void setTelId(Integer telId) {
        this.telId = telId;
    }

    public String getTelNumero() {
        return telNumero;
    }

    public void setTelNumero(String telNumero) {
        this.telNumero = telNumero;
    }
}
