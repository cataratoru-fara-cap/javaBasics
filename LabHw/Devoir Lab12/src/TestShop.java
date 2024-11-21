import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        
        
        
        try {
            File file = new File("Moniteur.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbers = line.split(" ");
                double monnaie = Double.parseDouble(numbers[0]);
                double note = Double.parseDouble(numbers[1]);
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }
}
