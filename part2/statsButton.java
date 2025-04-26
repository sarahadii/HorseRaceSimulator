package part2;
import javax.swing.*;

import part1.Horse; 


public class statsButton extends JFrame {

    public statsButton (Horse lane1Horse, Horse lane2Horse, Horse lane3Horse, int raceLength, Horse horse) {
        setTitle("Race Statistics");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panel.add(createPanel(lane1Horse, raceLength));
        panel.add(createPanel(lane2Horse, raceLength));
        panel.add(createPanel(lane3Horse, raceLength));

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> dispose());
        panel.add(closeButton);

        add(panel);
        setLocationRelativeTo(null);
        setVisible(true);


        }
    
        private JPanel createPanel(Horse horse, int raceLength) {
            JPanel horsePanel = new JPanel();
            horsePanel.setLayout(new BoxLayout(horsePanel, BoxLayout.Y_AXIS));
            horsePanel.setBorder(BorderFactory.createTitledBorder(horse.getName()));
    
            int distance = horse.getDistanceTravelled();
            horsePanel.add(new JLabel("Distance travelled: " + distance + "m"));
    
            double confidence = horse.getConfidence();
            horsePanel.add(new JLabel("Confidence: " + confidence));
    
            String status = horse.hasFallen() ? "Fallen" : "Running"; // vs copilot helped me with this since i didnt know how to get the info
            horsePanel.add(new JLabel("Status: " + status));
    
            double averageSpeed = distance > 0 ? (double) distance / 20.0 : 0.0;
            horsePanel.add(new JLabel("Average speed: " + averageSpeed + " m/s"));
    
            return horsePanel;
        }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Replace with appropriate constructor arguments
            Horse dummyHorse = new Horse("Dummy", 0, 0.0); 
            statsButton frame = new statsButton(dummyHorse, dummyHorse, dummyHorse, 100, dummyHorse);
            frame.setVisible(true);
        });
    }
}
