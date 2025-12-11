package school.sptech;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LeitorExcel {

    public List<Escola> extrairEscolas(String nomeArquivo, InputStream arquivo) {
        try {
            System.out.println("\nIniciando leitura do arquivo %s\n".formatted(nomeArquivo));

            Workbook workbook;
            if (nomeArquivo.endsWith(".xlsx")) {
                workbook = new XSSFWorkbook(arquivo);
            } else {
                workbook = new HSSFWorkbook(arquivo);
            }

            Sheet sheet = workbook.getSheetAt(0);
            List<Escola> escolasExtraidas = new ArrayList<>();

            for (Row row : sheet) {
                if (row.getRowNum() == 0) {
                    System.out.println("\nLendo cabeçalho:");
                    for (int i = 0; i < 10; i++) {
                        if (row.getCell(i) != null) {
                            System.out.println("Coluna " + i + ": " + row.getCell(i).getStringCellValue());
                        }
                    }
                    System.out.println("-------------");
                    continue;
                }

                System.out.println("Lendo linha " + row.getRowNum());
                Escola escola = new Escola();

                escola.setAno((int) row.getCell(0).getNumericCellValue());
                escola.setIdMunicipio((int) row.getCell(1).getNumericCellValue());
                escola.setIdEscola((int) row.getCell(2).getNumericCellValue());
                if (row.getCell(3).getCellType() == CellType.STRING) {
                    escola.setArea(row.getCell(3).getStringCellValue());
                } else if (row.getCell(3).getCellType() == CellType.NUMERIC) {
                    escola.setArea("não especificado");
                } else {
                    escola.setArea(null);
                }
                escola.setLocalizacao(row.getCell(4).getStringCellValue());
                escola.setRede(row.getCell(5).getStringCellValue());
                escola.setInseQuantidadeAlunos((int) row.getCell(6).getNumericCellValue());
                escola.setValorInse(row.getCell(7).getNumericCellValue());
                escola.setInseClassificacao2014(row.getCell(8).getStringCellValue());
                escola.setInseClassificacao2015(row.getCell(9).getStringCellValue());
                escola.setRegiao(row.getCell(10).getStringCellValue());

                escolasExtraidas.add(escola);
            }

            workbook.close();
            return escolasExtraidas;

        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler o arquivo " + nomeArquivo, e);
        }
    }
}
