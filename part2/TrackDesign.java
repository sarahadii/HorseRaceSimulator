package part2;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class TrackDesign extends JFrame{
    JSlider lengthSlider;
    JSlider laneSlider;
    JComboBox<String> shapeBox;
    JTextArea preview; 
    
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

        JPanel shapePanel = new JPanel(new BorderLayout());
        JLabel shapeLabel = new JLabel("Shape of the track:");
        String[] shapes = {"Oval", "Rectangular", "Circular"};
        shapeBox = new JComboBox<>(shapes);
        shapePanel.add(shapeLabel, BorderLayout.WEST);
        shapePanel.add(shapeBox, BorderLayout.CENTER);
        centerPanel.add(shapePanel, BorderLayout.NORTH);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TrackDesign frame = new TrackDesign();
            frame.setVisible(true);
        });
    }

}
