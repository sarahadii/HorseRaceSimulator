package part2;
import javax.swing.*;
import java.awt.*;
public class MainHorsePage extends JFrame {

    public MainHorsePage(){
        setTitle("Horse Race Simulator");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainHorsePage frame = new MainHorsePage();
            frame.setVisible(true);
        });
    }
}