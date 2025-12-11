package school.sptech;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import java.util.List;

public class DAO {
    private JdbcTemplate jdbcTemplate;

    public DAO() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://3.225.191.55:3306/hafutech?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("@Hafu2025");
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void salvarLista(List<Escola> escolas) {
        String sql = """
            INSERT INTO Escola
            (ano, id_municipio, id_escola, area, localizacao, rede,
             inse_qtd_alunos, valor_inse, inse_classificacao2014, inse_classificacao2015, regiao)
            VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
            """;

        List<Object[]> batchArgs = escolas.stream()
                .map(e -> new Object[]{
                        e.getAno(),
                        e.getIdMunicipio(),
                        e.getIdEscola(),
                        e.getArea(),
                        e.getLocalizacao(),
                        e.getRede(),
                        e.getInseQuantidadeAlunos(),
                        e.getValorInse(),
                        e.getInseClassificacao2014(),
                        e.getInseClassificacao2015(),
                        e.getRegiao()
                })
                .toList();

        jdbcTemplate.batchUpdate(sql, batchArgs);
    }

    public void salvarLogIndividual(LogSistema logSistema) {
        jdbcTemplate.update("""
            INSERT INTO Log_sistema
            (descricao_log)
            VALUES (?)
        """,
                logSistema.getDescricao()
        );
    }
}
