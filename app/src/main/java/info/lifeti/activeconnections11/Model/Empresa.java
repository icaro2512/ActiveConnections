package info.lifeti.activeconnections11.Model;


public class Empresa {
    private Integer empId;
    private String empDescricao;
    private Juridica jur;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpDescricao() {
        return empDescricao;
    }

    public void setEmpDescricao(String empDescricao) {
        this.empDescricao = empDescricao;
    }

    public Juridica getJur() {
        return jur;
    }

    public void setJur(Juridica jur) {
        this.jur = jur;
    }
}
