import java.io.*;

class TextEditor {
    public static void main(String[] args) {
        try {
            // Writing content to a file
            FileWriter fw = new FileWriter("text.txt");
            fw.write("Welcome to Java Programming!\n");
            fw.write("This is a text editor application.");
            fw.close();

            System.out.println("Content written successfully.");

            // Reading content from the file
            FileReader fr = new FileReader("text.txt");
            int ch;

            System.out.println("\nFile Content:");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}