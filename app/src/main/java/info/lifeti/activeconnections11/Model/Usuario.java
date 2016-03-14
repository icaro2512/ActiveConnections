package info.lifeti.activeconnections11.Model;


public class Usuario {
    private Integer usuId;
    private String usuApelido;
    private String usuLogin;
    private String usuSenha;
    private Fisica fis;
    private Empresa emp;
    private UsuarioFuncao usf;
    private Integer usuIdade;

    public Usuario() {

    }

    public Usuario(int usuId, String usuApelido, int usuIdade) {
        this.usuId = usuId;
        this.usuApelido = usuApelido;
        this.usuIdade = usuIdade;

    }

    public Integer getUsuId() {
        return usuId;
    }

    public void setUsuId(Integer usuId) {
        this.usuId = usuId;
    }

    public String getUsuApelido() {
        return usuApelido;
    }

    public void setUsuApelido(String usuApelido) {
        this.usuApelido = usuApelido;
    }

    public String getUsuLogin() {
        return usuLogin;
    }

    public void setUsuLogin(String usuLogin) {
        this.usuLogin = usuLogin;
    }

    public String getUsuSenha() {
        return usuSenha;
    }

    public void setUsuSenha(String usuSenha) {
        this.usuSenha = usuSenha;
    }

    public Fisica getFis() {
        return fis;
    }

    public void setFis(Fisica fis) {
        this.fis = fis;
    }

    public Empresa getEmp() {
        return emp;
    }

    public void setEmp(Empresa emp) {
        this.emp = emp;
    }

    public UsuarioFuncao getUsf() {
        return usf;
    }

    public void setUsf(UsuarioFuncao usf) {
        this.usf = usf;
    }

    public Integer getUsuIdade() {
        return usuIdade;
    }

    public void setUsuIdade(Integer usuIdade) {
        this.usuIdade = usuIdade;
    }
}
