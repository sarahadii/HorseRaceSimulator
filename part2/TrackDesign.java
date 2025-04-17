package part2;

import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class TrackDesign extends JFrame{
    JSlider lengthSlider;
    JSlider laneSlider;
    JComboBox<String> shapeBox;
    JTextArea preview; 
    
    public TrackDesign(){
        setTitle("Track Design");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TrackDesign frame = new TrackDesign();
            frame.setVisible(true);
        });
    }

}
