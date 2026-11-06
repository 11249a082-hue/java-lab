import javax.swing.*;
import java.awt.*;

class exp14 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the house body
        g.setColor(Color.YELLOW);
        g.fillRect(100, 150, 200, 150);

        // Draw the roof
        g.setColor(Color.RED);
        int x[] = {80, 200, 320};
        int y[] = {150, 50, 150};
        g.fillPolygon(x, y, 3);

        // Draw the door
        g.setColor(Color.BLUE);
        g.fillRect(175, 220, 50, 80);

        // Draw the left window
        g.setColor(Color.WHITE);
        g.fillRect(120, 180, 40, 40);
        g.setColor(Color.BLACK);
        g.drawRect(120, 180, 40, 40);
        g.drawLine(140, 180, 140, 220);
        g.drawLine(120, 200, 160, 200);

        // Draw the right window
        g.setColor(Color.WHITE);
        g.fillRect(240, 180, 40, 40);
        g.setColor(Color.BLACK);
        g.drawRect(240, 180, 40, 40);
        g.drawLine(260, 180, 260, 220);
        g.drawLine(240, 200, 280, 200);

        // Display title
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("My House", 155, 330);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("House Drawing");
        frame.add(new exp14());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
