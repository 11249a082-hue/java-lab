import java.awt.*;
import javax.swing.*;
class GridLayoutDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("Calculator");

        f.setLayout(new GridLayout(4, 4, 5, 5));

        String buttons[] = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (int i = 0; i < buttons.length; i++) {
            f.add(new JButton(buttons[i]));
        }

        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

