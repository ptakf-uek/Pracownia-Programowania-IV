import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LineWriter {
    public static void main(String[] args) {
        // Procedure that appends the passed text as a new line to the text file.
        Scanner scan = new Scanner(System.in);

        // Scan the file location.
        System.out.println("Enter the file location:");
        String fileLocation = scan.nextLine();

        try {
            File textFile = new File(fileLocation);

            // Check whether the file exists.
            if (!textFile.exists()) {
                System.out.println("The entered file does not exist!");

            } else {
                // Scan the text that will be appended to the file.
                System.out.println("Enter the text to be appended as a new line to a text file:");
                String text = scan.nextLine();

                FileWriter writer = new FileWriter(fileLocation, true);

                // Append the text to the file.
                writer.write("\n" + text);
                writer.close();
            }
        } catch (IOException e) {
            System.out.println("Something went wrong when writing to the file!");
        }
    }
}
