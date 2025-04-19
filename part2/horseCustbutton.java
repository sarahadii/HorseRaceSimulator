package part2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class horseCustbutton extends JFrame {
    Button breedButton;
    JComboBox<String> horseColor;
    //symbol  ,combo box accessories, attributes
    public horseCustbutton() {
        setTitle("Horse Customization");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout()); 

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(5, 1, 10, 10));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel breedPanel = new JPanel();
        JLabel breedLabel = new JLabel("Horse breed:");
        breedPanel.add(breedLabel,BorderLayout.WEST);
        JRadioButton arabian  = new JRadioButton("Arabian");
        JRadioButton thoroughbred = new JRadioButton("Thoroughbred");
        JRadioButton quarterHorse = new JRadioButton("Quarter Horse");
        JRadioButton appaloosa = new JRadioButton("Appaloosa");

        ButtonGroup breedGroup = new ButtonGroup();
        breedGroup.add(arabian);
        breedGroup.add(thoroughbred);
        breedGroup.add(quarterHorse);
        breedGroup.add(appaloosa);
        
        breedPanel.add(arabian);
        breedPanel.add(thoroughbred);
        breedPanel.add(quarterHorse);
        breedPanel.add(appaloosa);
        centerPanel.add(breedPanel, BorderLayout.SOUTH);
        add(centerPanel, BorderLayout.CENTER);

        JPanel colorPanel = new JPanel(new BorderLayout());
        JLabel conditionLabel = new JLabel("Color of the horse:");
        String[] colors = {"Black", "Brown", "White", "Grey", "Cream", "Chestnut"};
        horseColor = new JComboBox<>(colors);
        
        colorPanel.add(conditionLabel, BorderLayout.WEST);
        colorPanel.add(horseColor, BorderLayout.CENTER);
        centerPanel.add(colorPanel, BorderLayout.SOUTH);

        JPanel symbolPanel = new JPanel();
        JLabel symbolLabel = new JLabel("Horse's symbol:");
        JTextArea symbolArea = new JTextArea(3,5);
        symbolArea.setLineWrap(true);
        symbolArea.setWrapStyleWord(true);
        symbolArea.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));
        
        symbolPanel.add(symbolLabel, BorderLayout.WEST);
        symbolPanel.add(symbolArea, BorderLayout.CENTER);
        centerPanel.add(symbolPanel, BorderLayout.SOUTH);

    }
        
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            horseCustbutton frame = new horseCustbutton();
            frame.setVisible(true);
        });
    }
}

