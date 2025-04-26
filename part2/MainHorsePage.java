package part2;
import javax.swing.*;

import part1.Horse;

import java.awt.*;
import java.util.ArrayList;
public class MainHorsePage extends JFrame{
    public MainHorsePage(){
        setTitle("Horse Race Simulator");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel titJLabel = new JLabel("Horse Race Simulator" , SwingConstants.CENTER);
        add(titJLabel , BorderLayout.NORTH);

        GridLayout grid = new GridLayout(4,1, 5 , 5 );
        JPanel buttonPanel = new JPanel(grid);

        JButton trackDesignButton = new JButton("Track Design");
        trackDesignButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Opening Track design");
            new TrackDesign().setVisible(true); 

        });
        buttonPanel.add(trackDesignButton);

        JButton customizeButton = new JButton("Customize your horse");
        customizeButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Opening customize horse");
            horseCustbutton frame = new horseCustbutton();
            frame.setVisible(true);
        });
        buttonPanel.add(customizeButton);


        JButton statsButton = new JButton("Statistics and Analytics");
        statsButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Opening statistics");
            Horse dummyHorse = new Horse("Dummy", '!', 0.8, "Brown", "Thoroughbred");
            statsButton stats = new statsButton(dummyHorse, dummyHorse, dummyHorse, 500, dummyHorse);
            stats.setVisible(true);
        });
        buttonPanel.add(statsButton);
    

        buttonPanel.add(trackDesignButton);
        buttonPanel.add(customizeButton);
        buttonPanel.add(statsButton);
        

        add(buttonPanel, BorderLayout.CENTER);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainHorsePage frame = new MainHorsePage();
            frame.setVisible(true);
        });
    }
}
