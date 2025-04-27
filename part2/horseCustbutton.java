package part2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
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
        JLabel colorLabel = new JLabel("Color of the horse:");
        String[] colors = {"Black", "Brown", "White", "Grey", "Cream", "Chestnut"};
        horseColor = new JComboBox<>(colors);
        
        colorPanel.add(colorLabel);
        colorPanel.add(horseColor);
        centerPanel.add(colorPanel);

        JPanel symbolPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel symbolLabel = new JLabel("Horse's symbol:");
        String[] symbols = {"🐎", "🔥", "⭐", "💨", "💎", "🐴", "🌟", "🌈", "💥", "⚡","\u1F34B"};
        symbolBox = new JComboBox<>(symbols);
        
        symbolPanel.add(symbolLabel);
        symbolPanel.add(symbolBox);
        centerPanel.add(symbolPanel);

        JPanel accPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel accLabel = new JLabel("Accesserioze your horse:");
        String[] accs = {"Saddle", "Regular horseshoe", "Lightweight horseshoe", "Bridle", "Hat"};
        accessories = new JComboBox<>(accs);
        
        accPanel.add(accLabel);
        accPanel.add(accessories);
        centerPanel.add(accPanel);

        
        JTextArea attArea = new JTextArea(3, 10);
        attArea.setLineWrap(true);
        attArea.setWrapStyleWord(true);
        attArea.setBorder(BorderFactory.createTitledBorder("Attributes Impact"));
        JScrollPane attScrollPane = new JScrollPane(attArea);
        attScrollPane.setPreferredSize(new Dimension(250, 60)); 
        centerPanel.add(attScrollPane);

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
       
        namePanel.add(nameLabel);
        namePanel.add(nameField);
        centerPanel.add(namePanel);

        JPanel savePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton saveBtn = new JButton("Save Horse");
            saveBtn.addActionListener(e -> {
            String breed = "";
            if (arabian.isSelected()) breed = "Arabian";
            else if (thoroughbred.isSelected()) breed = "Thoroughbred";
            else if (quarterHorse.isSelected()) breed = "Quarter Horse";
            else if (appaloosa.isSelected()) breed = "Appaloosa";
            String color = (String) horseColor.getSelectedItem();
            String symbol = (String) symbolBox.getSelectedItem();
            double confidence = getConfidenceBreed();
            String name = nameField.getText();
                        
            Horse horse = new Horse(name, symbol, confidence, color, breed);
            System.out.println("Horse Name: " + horse.getName());
            System.out.println("Horse Symbol: " + horse.getSymbol());
            System.out.println("Horse Color: " + horse.getColor());
            System.out.println("Horse Breed: " + horse.getBreed());
            System.out.println("Horse Confidence: " + horse.getConfidence());

            MainHorsePage.savedHorses.add(horse); // add the horse to the list

            String message=("Horse saved successfully!");
            JOptionPane.showMessageDialog(this, message, "Horse Saved", JOptionPane.INFORMATION_MESSAGE);
            });
                    savePanel.add(saveBtn);
                    centerPanel.add(savePanel);
            
                    add(centerPanel, BorderLayout.CENTER);
                }
                    
                private double getConfidenceBreed() {
                    if (arabian.isSelected()) return 0.85;
                    if (thoroughbred.isSelected()) return 0.90;
                    if (quarterHorse.isSelected()) return 0.80;
                    if (appaloosa.isSelected()) return 0.75;
                    return 0;
                }
}

