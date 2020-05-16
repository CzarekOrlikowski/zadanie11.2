import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingUtils {

    public static int countLines() throws FileNotFoundException {
        String fileName = "C:\\Pliki Czarek\\JAVASTART\\zadanie11.2\\src\\dane.txt";
        File file = new File(fileName);
        int lineNumber = 0;

        try (Scanner scan = new Scanner(file)) {

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                lineNumber++;
            }

        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku!");
        }
        return lineNumber;
    }

    public static Operation[] readOperations(int lineNumber) throws FileNotFoundException {
        String fileName = "C:\\Pliki Czarek\\JAVASTART\\zadanie11.2\\src\\dane.txt";
        File file = new File(fileName);
        Operation[] operations = new Operation[lineNumber];
        int i = 0;

        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] data = line.split(" ");
                int first = Integer.parseInt(data[0]);
                String operation = data[1];
                int second = Integer.parseInt(data[2]);
                operations[i] = new Operation(first, operation, second);
                i++;
            }

        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku!");
        }
        return operations;
    }

}
