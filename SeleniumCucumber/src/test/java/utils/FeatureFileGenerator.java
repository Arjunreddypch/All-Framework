package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

public class FeatureFileGenerator {

    public static void generate() throws IOException {
        String templatePath = "src/test/resources/templates/LoginTemplate.feature";
        String excelPath = "src/test/resources/data/TestData.xlsx";
        String outputPath = "src/test/resources/temp/TempLogin.feature";

        StringBuilder feature = new StringBuilder();

        // 1. Read template
        try (BufferedReader br = new BufferedReader(new FileReader(templatePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                feature.append(line).append("\n");
            }
        }

        // 2. Read Excel
        List<String> headers = new ArrayList<>();
        List<List<String>> rows = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(excelPath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();

            // Headers
            Row headerRow = rowIterator.next();
            for (Cell cell : headerRow) {
                headers.add(cell.getStringCellValue());
            }

            // Data rows
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                List<String> data = new ArrayList<>();
                for (int i = 0; i < headers.size(); i++) {
                    Cell cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    data.add(cell.toString());
                }
                rows.add(data);
            }
        }

        // 3. Append Examples section
        feature.append("\nExamples:\n| ");
        feature.append(String.join(" | ", headers)).append(" |\n");

        for (List<String> row : rows) {
            feature.append("| ").append(String.join(" | ", row)).append(" |\n");
        }

        // 4. Write output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            writer.write(feature.toString());
        }

        System.out.println("✅ Temp feature file generated at: " + outputPath);
    }
}