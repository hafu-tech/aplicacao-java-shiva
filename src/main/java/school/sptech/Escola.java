package school.sptech;

public class Escola {
    private Integer ano;
    private Integer idMunicipio;
    private Integer idEscola;
    private String area;
    private String localizacao;
    private String rede;
    private Integer inseQuantidadeAlunos;
    private Double valorInse;
    private String inseClassificacao2014;
    private String inseClassificacao2015;
    private String regiao;

    public Escola() {
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getIdEscola() {
        return idEscola;
    }

    public void setIdEscola(Integer idEscola) {
        this.idEscola = idEscola;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getRede() {
        return rede;
    }

    public void setRede(String rede) {
        this.rede = rede;
    }

    public Integer getInseQuantidadeAlunos() {
        return inseQuantidadeAlunos;
    }

    public void setInseQuantidadeAlunos(Integer inseQuantidadeAlunos) {
        this.inseQuantidadeAlunos = inseQuantidadeAlunos;
    }

    public Double getValorInse() {
        return valorInse;
    }

    public void setValorInse(Double valorInse) {
        this.valorInse = valorInse;
    }

    public String getInseClassificacao2014() {
        return inseClassificacao2014;
    }

    public void setInseClassificacao2014(String inseClassificacao2014) {
        this.inseClassificacao2014 = inseClassificacao2014;
    }

    public String getInseClassificacao2015() {
        return inseClassificacao2015;
    }

    public void setInseClassificacao2015(String inseClassificacao2015) {
        this.inseClassificacao2015 = inseClassificacao2015;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    @Override
    public String toString() {
        return "Escola{" +
                "ano=" + ano +
                ", idMunicipio=" + idMunicipio +
                ", idEscola=" + idEscola +
                ", area='" + area + '\'' +
                ", localizacao='" + localizacao + '\'' +
                ", rede='" + rede + '\'' +
                ", inseQuantidadeAlunos=" + inseQuantidadeAlunos +
                ", valorInse=" + valorInse +
                ", inseClassificacao2014='" + inseClassificacao2014 + '\'' +
                ", inseClassificacao2015='" + inseClassificacao2015 + '\'' +
                ", regiao='" + regiao + '\'' +
                '}';
    }
}
