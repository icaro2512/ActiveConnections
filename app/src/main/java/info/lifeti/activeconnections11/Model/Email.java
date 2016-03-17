package info.lifeti.activeconnections11.Model;

import java.io.Serializable;

public class Email implements Serializable {
    private Integer emaId;
    private String emaEmail;

    public Integer getEmaId() {
        return emaId;
    }

    public void setEmaId(Integer emaId) {
        this.emaId = emaId;
    }

    public String getEmaEmail() {
        return emaEmail;
    }

    public void setEmaEmail(String emaEmail) {
        this.emaEmail = emaEmail;
    }
}
