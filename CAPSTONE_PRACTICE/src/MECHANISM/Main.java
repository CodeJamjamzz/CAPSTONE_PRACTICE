package MECHANISM;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Practice");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack(); // it will automatically resize the dimension in your window based on the GamePanel

        window.setLocationRelativeTo(null); // meaning it will display at the center
        window.setVisible(true); // so we can see this window
    }
}
