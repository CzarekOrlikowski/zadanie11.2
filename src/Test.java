import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        int lineNumber = ReadingUtils.countLines();

        Operation[] operations = ReadingUtils.readOperations(lineNumber);
        Result[] results = ResultUtils.createResults(operations);

        try {
            String fileName = "wyniki.txt";
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter dane = new BufferedWriter(fileWriter);

            for (int i = 0; i < results.length; i++) {
                dane.write(results[i].getFirst() + " " + results[i].getOperator() + " " +
                        results[i].getSecond() + " " + results[i].getEqual() + " "
                        + results[i].getResult());
                dane.newLine();
            }
            dane.close();
        } catch (
                IOException e) {
            System.err.println("Błąd zapisu pliku!");
        }
    }
}
