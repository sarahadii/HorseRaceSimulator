package part2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
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
        laneSlider = new JSlider(1, 8, 4);
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
        shapeGroup.add(ovalButton);
        shapeGroup.add(f8Button);
        shapeGroup.add(straightButton);

        shapePanel.add(ovalButton);
        shapePanel.add(f8Button);
        shapePanel.add(straightButton);
        centerPanel.add(shapePanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TrackDesign frame = new TrackDesign();
            frame.setVisible(true);
        });
    }

}
