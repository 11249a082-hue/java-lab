import javax.swing.*;
import java.awt.*;

class Shapes extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw Rectangle
        g.setColor(Color.RED);
        g.drawRect(50, 50, 120, 70);
        g.drawString("Rectangle", 70, 140);

        // Draw Circle
        g.setColor(Color.BLUE);
        g.drawOval(220, 50, 80, 80);
        g.drawString("Circle", 240, 150);

        // Draw Line
        g.setColor(Color.GREEN);
        g.drawLine(50, 200, 170, 200);
        g.drawString("Line", 100, 220);

        // Draw Triangle
        g.setColor(Color.MAGENTA);
        int x[] = {230, 190, 270};
        int y[] = {190, 260, 260};
        g.drawPolygon(x, y, 3);
        g.drawString("Triangle", 205, 280);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Geometric Shapes");
        Shapes panel = new Shapes();

        frame.add(panel);
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
