package part2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import part1.Horse; 

public class horseCustbutton extends JFrame {
    Button breedButton;
    JComboBox<String> horseColor;
    JComboBox<String> accessories;
    JComboBox<String> symbolBox;
    private JRadioButton arabian, thoroughbred, quarterHorse, appaloosa;
    private JTextField nameField;

    public horseCustbutton() {
        setTitle("Horse Customization");
        setSize(950, 700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout()); 

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel breedPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel breedLabel = new JLabel("Horse breed:");
        breedPanel.add(breedLabel,BorderLayout.WEST);
        arabian = new JRadioButton("Arabian");
        thoroughbred = new JRadioButton("Thoroughbred");
        quarterHorse = new JRadioButton("Quarter Horse");
        appaloosa = new JRadioButton("Appaloosa");

        ButtonGroup breedGroup = new ButtonGroup();
        breedGroup.add(arabian);
        breedGroup.add(thoroughbred);
        breedGroup.add(quarterHorse);
        breedGroup.add(appaloosa);
        
        breedPanel.add(arabian);
        breedPanel.add(thoroughbred);
        breedPanel.add(quarterHorse);
        breedPanel.add(appaloosa);
        centerPanel.add(breedPanel);
        add(centerPanel, BorderLayout.CENTER);

        JPanel colorPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel conditionLabel = new JLabel("Color of the horse:");
        String[] colors = {"Black", "Brown", "White", "Grey", "Cream", "Chestnut"};
        horseColor = new JComboBox<>(colors);
        
        colorPanel.add(conditionLabel, BorderLayout.WEST);
        colorPanel.add(horseColor, BorderLayout.CENTER);
        centerPanel.add(colorPanel, BorderLayout.SOUTH);

        JPanel symbolPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel symbolLabel = new JLabel("Horse's symbol:");
        String[] symbols = {"🐎", "🔥", "⭐", "💨", "💎", "🐴", "🌟", "🌈", "💥", "⚡"};
        symbolBox = new JComboBox<>(symbols);
        
        symbolPanel.add(symbolLabel, BorderLayout.WEST);
        symbolPanel.add(symbolBox, BorderLayout.CENTER);
        centerPanel.add(symbolPanel);

        JPanel accPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel accLabel = new JLabel("Accesserioze your horse:");
        String[] accs = {"Saddle", "Regular horseshoe", "Lightweight horseshoe", "Bridle", "Hat"};
        accessories = new JComboBox<>(accs);
        
        accPanel.add(accLabel, BorderLayout.WEST);
        accPanel.add(accessories, BorderLayout.CENTER);
        centerPanel.add(accPanel);

        
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

        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel nameLabel = new JLabel("Horse Name:");
        nameField = new JTextField(10);
       
        namePanel.add(nameLabel, BorderLayout.WEST);
        namePanel.add(nameField, BorderLayout.CENTER);
        centerPanel.add(namePanel, BorderLayout.SOUTH);

        JPanel savePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        Button saveBtn = null;
            saveBtn.addActionListener(e -> {
            String breed = "";
            if (arabian.isSelected()) breed = "Arabian";
            else if (thoroughbred.isSelected()) breed = "Thoroughbred";
            else if (quarterHorse.isSelected()) breed = "Quarter Horse";
            else if (appaloosa.isSelected()) breed = "Appaloosa";
            String color = (String) horseColor.getSelectedItem();
        });
        centerPanel.add(saveBtn);

        savePanel.add(saveBtn);
        centerPanel.add(savePanel);
    }
        
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            horseCustbutton frame = new horseCustbutton();
            frame.setVisible(true);
        });
    }
}

