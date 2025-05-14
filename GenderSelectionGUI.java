import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GenderSelectionGUI {
    public static void main(String[] args) {
        // Ensure GUI is created on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Create a frame for the window
                JFrame frame = new JFrame("Gender Selection");

                // Create radio buttons
                final JRadioButton maleButton = new JRadioButton("Male");
                final JRadioButton femaleButton = new JRadioButton("Female");
                final JRadioButton otherButton = new JRadioButton("Other");

                // Group the radio buttons so that only one can be selected
                ButtonGroup group = new ButtonGroup();
                group.add(maleButton);
                group.add(femaleButton);
                group.add(otherButton);

                // Create a label to display the selected gender
                final JLabel resultLabel = new JLabel();

                // Create a button to submit the selection
                JButton submitButton = new JButton("Submit");

                // Action listener for the submit button
                submitButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Check which radio button is selected
                        if (maleButton.isSelected()) {
                            resultLabel.setText("Selected Gender: Male");
                        } else if (femaleButton.isSelected()) {
                            resultLabel.setText("Selected Gender: Female");
                        } else if (otherButton.isSelected()) {
                            resultLabel.setText("Selected Gender: Other");
                        } else {
                            resultLabel.setText("Please select a gender.");
                        }
                    }
                });

                // Set layout for the frame
                frame.setLayout(new FlowLayout());

                // Set font for components
                Font font = new Font("Arial", Font.PLAIN, 16);
                maleButton.setFont(font);
                femaleButton.setFont(font);
                otherButton.setFont(font);
                submitButton.setFont(font);
                resultLabel.setFont(font);

                // Add components to the frame
                frame.add(maleButton);
                frame.add(femaleButton);
                frame.add(otherButton);
                frame.add(submitButton);
                frame.add(resultLabel);

                // Frame settings
                frame.setSize(300, 250);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}
