package info.lifeti.activeconnections11.Model;


import java.io.Serializable;

public class PessoaTelefone implements Serializable {
    private Pessoa pes;
    private Telefone tel;
    private String petStatus;
    private String petDescricao;

    public Pessoa getPes() {
        return pes;
    }

    public void setPes(Pessoa pes) {
        this.pes = pes;
    }

    public Telefone getTel() {
        return tel;
    }

    public void setTel(Telefone tel) {
        this.tel = tel;
    }

    public String getPetStatus() {
        return petStatus;
    }

    public void setPetStatus(String petStatus) {
        this.petStatus = petStatus;
    }

    public String getPetDescricao() {
        return petDescricao;
    }

    public void setPetDescricao(String petDescricao) {
        this.petDescricao = petDescricao;
    }
}
