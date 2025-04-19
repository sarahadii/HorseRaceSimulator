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
    JComboBox<String> accessories;
    public horseCustbutton() {
        setTitle("Horse Customization");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout()); 

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(6, 1, 10, 10));
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

        JPanel accPanel = new JPanel(new BorderLayout());
        JLabel accLabel = new JLabel("Accesserioze your horse:");
        String[] accs = {"Saddle", "Regular horseshoe", "Lightweight horseshoe", "Bridle", "Hat"};
        accessories = new JComboBox<>(accs);
        
        accPanel.add(accLabel, BorderLayout.WEST);
        accPanel.add(accessories, BorderLayout.CENTER);
        centerPanel.add(accPanel);

        JPanel buttonPanel = new JPanel();
        JTextArea attArea = new JTextArea(5, 10);
        attArea.setLineWrap(true);
        attArea.setWrapStyleWord(true);
        attArea.setBorder(BorderFactory.createTitledBorder("Attributes Impact"));
        centerPanel.add(attArea);

        arabian.addActionListener(e -> {
            attArea.setText("Arabian\nSpeed: +10\nConfidence: +15");
        });
        thoroughbred.addActionListener(e -> {
            attArea.setText("Thoroughbred\nSpeed: +15\nConfidence: +10");
        });
        quarterHorse.addActionListener(e -> {
            attArea.setText("Quarter Horse\nSpeed: +5\nConfidence: +20");
        });
        appaloosa.addActionListener(e -> {
            attArea.setText("Appaloosa\nSpeed: +5\nConfidence: +10");
        });
        
        add(centerPanel, BorderLayout.CENTER);
    }
        
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            horseCustbutton frame = new horseCustbutton();
            frame.setVisible(true);
        });
    }
}

