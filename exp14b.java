import java.awt.*;
import javax.swing.*;

class BorderLayoutDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("BorderLayout Example");

        f.setLayout(new BorderLayout());

        JLabel north = new JLabel("HEADER - NORTH", JLabel.CENTER);
        JLabel south = new JLabel("FOOTER - SOUTH", JLabel.CENTER);
        JLabel east = new JLabel("EAST", JLabel.CENTER);
        JLabel west = new JLabel("MENU - WEST", JLabel.CENTER);
        JLabel center = new JLabel("CONTENT - CENTER", JLabel.CENTER);

        f.add(north, BorderLayout.NORTH);
        f.add(south, BorderLayout.SOUTH);
        f.add(east, BorderLayout.EAST);
        f.add(west, BorderLayout.WEST);
        f.add(center, BorderLayout.CENTER);

        f.setSize(500, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

