package swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClockDemo implements ActionListener {

    JLabel messageLabel;

    public ClockDemo() {
        // Create the JFrame
        JFrame frame = new JFrame("Clock Button Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create label
        messageLabel = new JLabel("Click a button!");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Load images (you must have these in your project folder)
        ImageIcon digitalClockIcon = new ImageIcon("C:\\Users\\srush\\OneDrive\\Desktop\\digi.jpg"); // Place this image in project folder
        ImageIcon hourGlassIcon = new ImageIcon("C:\\Users\\srush\\OneDrive\\Desktop\\hour.jpg");       // Place this image in project folder

        // Create buttons with images
        JButton digitalClockButton = new JButton("Digital Clock", digitalClockIcon);
        JButton hourGlassButton = new JButton("Hour Glass", hourGlassIcon);

        // Add action listeners
        digitalClockButton.addActionListener(this);
        hourGlassButton.addActionListener(this);

        // Set action commands for identification
        digitalClockButton.setActionCommand("Digital Clock");
        hourGlassButton.setActionCommand("Hour Glass");

        // Add components to frame
        frame.add(digitalClockButton);
        frame.add(hourGlassButton);
        frame.add(messageLabel);

        // Show the frame
        frame.setVisible(true);
    }

    // Handle button events
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        messageLabel.setText(cmd + " is pressed");
    }

    public static void main(String[] args) {
        // Run GUI in Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new ClockDemo());
    }
}
