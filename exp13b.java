import javax.swing.*;
import java.awt.*;

public class exp13b extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw red rectangle
        g.setColor(Color.RED);
        g.drawRect(50, 50, 150, 80);

        // Draw blue oval
        g.setColor(Color.BLUE);
        g.drawOval(250, 50, 100, 80);

        // Display bold message
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Java Applets are fun!", 70, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Shapes");
        frame.add(new exp13b());
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

