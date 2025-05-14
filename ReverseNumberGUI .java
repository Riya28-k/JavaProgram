import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumberGUI extends JFrame implements ActionListener {
    private JTextField inputField;
    private JButton reverseButton;
    private JLabel resultLabel;

    public ReverseNumberGUI() {
        // Frame title
        setTitle("Number Reverser");

        // Layout manager
        setLayout(new FlowLayout());

        // Input field
        inputField = new JTextField(10);
        add(new JLabel("Enter a number:"));
        add(inputField);

        // Button
        reverseButton = new JButton("Reverse");
        reverseButton.addActionListener(this);
        add(reverseButton);

        // Result label
        resultLabel = new JLabel("Reversed number will appear here.");
        add(resultLabel);

        // Frame settings
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Action performed on button click
    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(inputField.getText());
            int reversed = 0;

            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }

            resultLabel.setText("Reversed: " + reversed);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        new ReverseNumberGUI();
    }
}
