/*
 * 4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( ).
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Button Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));

        // Load and scale images
        ImageIcon digitalClockIcon = new ImageIcon("C:\\Users\\yoges\\Downloads\\digitalclock.png");
        ImageIcon hourGlassIcon = new ImageIcon("C:\\Users\\yoges\\Downloads\\hourglass.jpg");

        Image digitalClockImg = digitalClockIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Image hourGlassImg = hourGlassIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        // Buttons with scaled icons
        JButton btnDigitalClock = new JButton(new ImageIcon(digitalClockImg));
        JButton btnHourGlass = new JButton(new ImageIcon(hourGlassImg));

        // Label directly under buttons
        JLabel messageLabel = new JLabel("Press an image button", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 14));

        // Add action listeners
        btnDigitalClock.addActionListener(e -> messageLabel.setText("Digital Clock is pressed"));
        btnHourGlass.addActionListener(e -> messageLabel.setText("Hour Glass is pressed"));

        // Assemble components
        buttonPanel.add(btnDigitalClock);
        buttonPanel.add(btnHourGlass);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(messageLabel, BorderLayout.SOUTH);

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
