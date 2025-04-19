package part2;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
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

        JPanel lengthPanel = new JPanel(new BorderLayout());
        JLabel lengthLabel = new JLabel("Length of the track (in meters):");
        lengthSlider = new JSlider(100, 1000, 500);
        lengthSlider.setMajorTickSpacing(100);
        lengthSlider.setMinorTickSpacing(10);

        lengthPanel.add(lengthLabel, BorderLayout.WEST);
        lengthPanel.add(lengthSlider, BorderLayout.CENTER);
        lengthSlider.setPaintTicks(true);
        lengthSlider.setPaintTicks(true);

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(lengthPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);

        JPanel lanePanel = new JPanel(new BorderLayout());
        JLabel laneLabel = new JLabel("Number of lanes:");
        laneSlider = new JSlider(1, 8, 4);
        laneSlider.setMajorTickSpacing(1);
        laneSlider.setMinorTickSpacing(1);
        lanePanel.add(laneLabel, BorderLayout.WEST);
        lanePanel.add(laneSlider, BorderLayout.CENTER);
        laneSlider.setPaintTicks(true);
        centerPanel.add(lanePanel, BorderLayout.CENTER);

        JPanel conPanel = new JPanel(new BorderLayout());
        JLabel condition = new JLabel("Condition of the track:");
        String[] shapes = {"Dry", "Wet", "Muddy", "Snowy", "Icy"};
        condition = new JComboBox<>(shapes);
        conPanel.add(condition, BorderLayout.WEST);
        conPanel.add(condition, BorderLayout.CENTER);
        centerPanel.add(conPanel, BorderLayout.SOUTH);

        JPanel conditionPanel = new JPanel(new BorderLayout());
        JLabel conditionLabel = new JLabel("Condition of the track:");
        conditionGroup = new ButtonGroup();
        JRadioButton dryButton = new JRadioButton("Dry");
        JRadioButton wetButton = new JRadioButton("Wet");
        JRadioButton muddyButton = new JRadioButton("Muddy");
        JRadioButton snowyButton = new JRadioButton("Snowy");
        JRadioButton icyButton = new JRadioButton("Icy");

        conditionGroup.add(dryButton);
        conditionGroup.add(wetButton);
        conditionGroup.add(muddyButton);
        conditionGroup.add(snowyButton);
        conditionGroup.add(icyButton);
        
        conditionPanel.add(conditionLabel, BorderLayout.WEST);
        conditionPanel.add(dryButton, BorderLayout.CENTER);
        conditionPanel.add(wetButton, BorderLayout.SOUTH);
        conditionPanel.add(muddyButton, BorderLayout.EAST);
        conditionPanel.add(snowyButton, BorderLayout.NORTH);
        conditionPanel.add(icyButton, BorderLayout.WEST);
        
        centerPanel.add(conditionPanel, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TrackDesign frame = new TrackDesign();
            frame.setVisible(true);
        });
    }

}
