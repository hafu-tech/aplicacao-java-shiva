package school.sptech;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import java.util.List;

public class DAO {
    private JdbcTemplate jdbcTemplate;

    public DAO() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://mysql:3306/hafutech?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC");
        dataSource.setUsername("henry");;
        dataSource.setPassword("123");;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void salvarLista(List<Escola> escolas) {
        int contador = 1;
        for (Escola e : escolas) {
            jdbcTemplate.update(
                """
                INSERT INTO Escola
                (ano, id_municipio, id_escola, area, localizacao, rede,
                 inse_qtd_alunos, valor_inse, inse_classificacao2014, inse_classificacao2015)
                VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
                """,
                    e.getAno(),
                    e.getIdMunicipio(),
                    e.getIdEscola(),
                    e.getArea(),
                    e.getLocalizacao(),
                    e.getRede(),
                    e.getInseQuantidadeAlunos(),
                    e.getValorInse(),
                    e.getInseClassificacao2014(),
                    e.getInseClassificacao2015()
            );
            Log log = new Log("Linha " + contador + " adicionada");
            salvarLogIndividual(log);
            contador++;
        }
    }

    public void salvarLogIndividual(Log log) {
        jdbcTemplate.update("""
            INSERT INTO Log_sistema
            (descricao)
            VALUES (?)
        """,
                log.getDescricao()
        );
    }
        }

