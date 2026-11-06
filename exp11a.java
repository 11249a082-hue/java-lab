import java.io.*;

class FitnessApp {
    public static void main(String[] args) {
        try {
            // User profile data
            String profile = "Name: Anu\nAge: 20\nWeight: 60 kg";

            // Writing data to a text file
            FileOutputStream fos = new FileOutputStream("profile.txt");
            fos.write(profile.getBytes());
            fos.close();

            System.out.println("Profile data written successfully.");

            // Reading data from the text file
            FileInputStream fis = new FileInputStream("profile.txt");

            int ch;
            System.out.println("\nUser Profile Data:");

            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            fis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}