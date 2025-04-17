package part2;
import javax.swing.*;
import java.awt.*;
public class MainHorsePage extends JFrame {

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
            new TrackDesign();
        });
        buttonPanel.add(trackDesignButton);
        add(buttonPanel , BorderLayout.CENTER);

        JButton horseCustbutton = new JButton("Customize your horse");
        horseCustbutton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Opening customize horse");
            new horseCustbutton();
        });
        buttonPanel.add(horseCustbutton);
        add(buttonPanel , BorderLayout.CENTER);

        JButton statsButton = new JButton("Statistics and Analytics");
        horseCustbutton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Opening statistics");
            new statsButton();
        });
        buttonPanel.add(statsButton);
        add(buttonPanel , BorderLayout.CENTER);

        buttonPanel.add(horseCustbutton);
        add(buttonPanel , BorderLayout.CENTER);

        JButton bettingButton = new JButton("Betting system");
        horseCustbutton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Opening betting system");
            new bettingButton();
        });
        buttonPanel.add(bettingButton);
        add(buttonPanel , BorderLayout.CENTER);
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainHorsePage frame = new MainHorsePage();
            frame.setVisible(true);
        });
    }
}