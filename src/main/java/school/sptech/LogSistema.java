package school.sptech;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogSistema extends Log {

    public LogSistema(Integer id, String data, String descricao, Integer qtdRegistros, Integer fkStatus) {
        super(id, data, descricao, qtdRegistros, fkStatus);
    }

}
