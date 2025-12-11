package school.sptech;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Log {

    private Integer id;
    private String data;
    private String descricao;
    private Integer qtdRegistros;
    private Integer fkStatus;

    public Log(Integer id, String data, String descricao, Integer qtdRegistros, Integer fkStatus) {
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.qtdRegistros = qtdRegistros;
        this.fkStatus = fkStatus;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime dataHora = LocalDateTime.now();
        this.data = dataHora.format(formatter);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQtdRegistros() {
        return qtdRegistros;
    }

    public void setQtdRegistros(Integer qtdRegistros) {
        this.qtdRegistros = qtdRegistros;
    }

    public Integer getFkStatus() {
        return fkStatus;
    }

    public void setFkStatus(Integer fkStatus) {
        this.fkStatus = fkStatus;
    }
}
