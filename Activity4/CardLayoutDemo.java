import java.awt.*;
import javax.swing.*;

public class CardLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480,260);

        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        // Card 1
        JPanel card1 = new JPanel(new FlowLayout());
        card1.add(new JLabel("This is a Card 1"));
        card1.add(new JButton("Button A"));

        // Card 2
        JPanel card2 = new JPanel(new FlowLayout());
        card2.add(new JLabel("This is a Card 2"));
        card2.add(new JButton("Button B"));

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
