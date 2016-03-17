package info.lifeti.activeconnections11.WS;

public class buscarCep {
    private String url = "http://lifeti.netau.net/prospeccao/buscarCep.php?cepNumero=";
    //JSON Strings
    public static final String cepId = "cepId";
    public static final String cepNumero = "cepNumero";
    public static final String cepEndereco = "cepEndereco";
    public static final String cepComplemento = "cepComplemento";
    public static final String cepLogradouro = "cepLogradouro";
    public static final String baiId = "baiId";
    public static final String baiNome = "baiNome";
    public static final String baiAbrev = "baiAbrev";
    public static final String cidId = "cidId";
    public static final String cidNome = "cidNome";
    public static final String estId = "estId";
    public static final String estNome = "estNome";
    public static final String estUf = "estUf";
    public static final String paiId = "paiId";
    public static final String paiNome = "paiNome";
    public static final String paiSigla = "paiSigla";
    //JSON nome da Array
    public static final String arrayCep = "Cep";


    public buscarCep(String cepNumero) {
        url = url+""+cepNumero;
    }




}
