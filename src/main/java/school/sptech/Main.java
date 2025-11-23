package school.sptech;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String nomeArquivo = "INSE.xlsx";

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'às' HH:mm:ss");

        try {
            S3Reader s3 = new S3Reader();
            InputStream arquivo = s3.getFileFromS3("s3-raw-hafu", nomeArquivo);

            LeitorExcel leitorExcel = new LeitorExcel();
            List<Escola> escolasExtraidas = leitorExcel.extrairEscolas(nomeArquivo, arquivo);

            arquivo.close();

            DAO dao = new DAO();
            dao.salvarLista(escolasExtraidas);

            String dataHora = LocalDateTime.now().format(formatter);
            System.out.println(dataHora +
                    " Foram adicionados " + escolasExtraidas.size() + " dados no banco.");

        } catch (Exception e) {
            System.out.println("Erro ao processar o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
