package part2;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class TrackDesign extends JFrame{
    JSlider lengthSlider;
    JSlider laneSlider;
    JComboBox<String> condition;
    JTextArea preview; 
    ButtonGroup shapeGroup;
    
    public TrackDesign(){
        setTitle("Track Design");
        setSize(700,700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setVisible(true);

        JLabel title = new JLabel(" Track Design", SwingConstants.CENTER);
        add(title, BorderLayout.NORTH);
        
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(5, 1, 10, 10));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel lengthPanel = new JPanel(new BorderLayout());
        JLabel lengthLabel = new JLabel("Length of the track (in meters):");
        lengthSlider = new JSlider(100, 1000, 500);
        lengthSlider.setMajorTickSpacing(100);
        lengthSlider.setMinorTickSpacing(10);

        lengthPanel.add(lengthLabel, BorderLayout.WEST);
        lengthPanel.add(lengthSlider, BorderLayout.CENTER);
        lengthSlider.setPaintTicks(true);
        lengthSlider.setPaintTicks(true);

        centerPanel.add(lengthPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);

        JPanel lanePanel = new JPanel(new BorderLayout());
        JLabel laneLabel = new JLabel("Number of lanes:");
        laneSlider = new JSlider(1, 3, 2);
        laneSlider.setMajorTickSpacing(1);
        laneSlider.setMinorTickSpacing(1);
        lanePanel.add(laneLabel, BorderLayout.WEST);
        lanePanel.add(laneSlider, BorderLayout.CENTER);
        laneSlider.setPaintTicks(true);
        centerPanel.add(lanePanel, BorderLayout.CENTER);

        JPanel conPanel = new JPanel(new BorderLayout());
        JLabel conditionLabel = new JLabel("Condition of the track:");
        String[] shapes = {"Dry", "Wet", "Muddy", "Snowy", "Icy"};
        condition = new JComboBox<>(shapes);
        conPanel.add(conditionLabel, BorderLayout.WEST);
        conPanel.add(condition, BorderLayout.CENTER);
        centerPanel.add(conPanel, BorderLayout.SOUTH);

        JPanel shapePanel = new JPanel();
        JLabel shapeLabel = new JLabel("Shape of the track:");
        shapePanel.add(shapeLabel,BorderLayout.WEST);
        shapeGroup = new ButtonGroup();
        JRadioButton ovalButton = new JRadioButton("Oval");
        JRadioButton f8Button = new JRadioButton("Figure-eight");
        JRadioButton straightButton = new JRadioButton("Straight");
    
        shapeGroup = new ButtonGroup();
        ovalButton.setActionCommand("Oval");
        f8Button.setActionCommand("Figure-eight");
        straightButton.setActionCommand("Straight");
        shapeGroup.add(ovalButton);
        shapeGroup.add(f8Button);
        shapeGroup.add(straightButton);

        shapePanel.add(ovalButton);
        shapePanel.add(f8Button);
        shapePanel.add(straightButton);
        centerPanel.add(shapePanel, BorderLayout.CENTER);

        preview = new JTextArea();
        preview.setEditable(false);
        preview.setBorder(BorderFactory.createTitledBorder("Track Preview"));
        centerPanel.add(preview, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        JButton previewBtn = new JButton("Preview");
        previewBtn.addActionListener(e -> showPreview());
        bottomPanel.add(previewBtn);

        JButton saveBtn = new JButton("Save Track");
        bottomPanel.add(saveBtn);
        add(bottomPanel, BorderLayout.SOUTH);

        saveBtn.addActionListener(e -> {
            int length = lengthSlider.getValue();
            int lanes = laneSlider.getValue();
            String shape = shapeGroup.getSelection() != null ? shapeGroup.getSelection().getActionCommand() : "None";
            String conditionValue = (String) condition.getSelectedItem();
            String message = "Track saved with the following details:\n" +
                    "Length: " + length + " meters\n" +
                    "Lanes: " + lanes + "\n" +
                    "Shape: " + shape + "\n" +
                    "Condition: " + conditionValue;
            JOptionPane.showMessageDialog(this, message, "Track Saved", JOptionPane.INFORMATION_MESSAGE);
        });
        add(centerPanel, BorderLayout.CENTER);

    }

    private void showPreview() {
        String shape = shapeGroup.getSelection() != null ? shapeGroup.getSelection().getActionCommand() : "None"; // vs copilot gave me this since getselectedItem didnt work
        int length = lengthSlider.getValue();
        int lanes = laneSlider.getValue();
        String conditionValue = (String) condition.getSelectedItem();

        String effect = "";
        if (conditionValue.equals("Dry")) {
            effect = "Fastest speed, high confidence";
        } 
        else if (conditionValue.equals("Wet")) {
            effect = "Slightly reduced speed, slight fall risk";
        } 
        else if (conditionValue.equals("Muddy")) {
            effect = "Lower speed, moderate fall risk";
        } 
        else if (conditionValue.equals("Snowy")) {
            effect = "Low speed, moderate-high fall risk";
        } 
        else if (conditionValue.equals("Icy")) {
            effect = "Very low speed, very high fall risk";
        }

        preview.setText("Shape: " + shape + "\nLength: " + length + " meters\nLanes: " + lanes + "\nCondition: " + conditionValue + "\nEffect: " + effect);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TrackDesign frame = new TrackDesign();
            frame.setVisible(true);
        });
    }

}
