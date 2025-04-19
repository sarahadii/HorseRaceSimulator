package part2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class horseCustbutton extends JFrame {
    Button breedButton;
    // combo box color,symbol text ,combo box accessories, attributes
    public horseCustbutton() {
        setTitle("Horse Customization");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(5, 1, 10, 10));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel breedPanel = new JPanel();
        JLabel breedLabel = new JLabel("Horse breed:");
        breedPanel.add(breedLabel,BorderLayout.WEST);
        breedButton = new Button();
        JRadioButton arabian  = new JRadioButton("Arabian");
        JRadioButton thoroughbred = new JRadioButton("Thoroughbred");
        JRadioButton quarterHorse = new JRadioButton("Quarter Horse");
        JRadioButton appaloosa = new JRadioButton("Appaloosa");

        breedPanel.add(arabian);
        breedPanel.add(thoroughbred);
        breedPanel.add(quarterHorse);
        breedPanel.add(appaloosa);
        centerPanel.add(breedPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);

        

    }

}
