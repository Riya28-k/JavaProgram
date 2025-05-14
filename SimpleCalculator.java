import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame {
    private JTextField textField;
    private StringBuilder input;
    private double firstNumber, secondNumber, result;
    private String operator;

    public SimpleCalculator() {
        // Initialize the JFrame
        setTitle("Simple Calculator");
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create text field and set it at the top
        input = new StringBuilder();
        textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        add(textField, BorderLayout.NORTH);

        // Create a panel for the buttons and set it in the center
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4)); // 4 rows, 4 columns
        add(panel, BorderLayout.CENTER);

        // Button labels
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        // Add buttons to the panel
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }
    }

    // Event handler for button clicks
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("=")) {
                // Perform the calculation when '=' is pressed
                try {
                    secondNumber = Double.parseDouble(input.toString());
                    switch (operator) {
                        case "+":
                            result = firstNumber + secondNumber;
                            break;
                        case "-":
                            result = firstNumber - secondNumber;
                            break;
                        case "*":
                            result = firstNumber * secondNumber;
                            break;
                        case "/":
                            if (secondNumber != 0) {
                                result = firstNumber / secondNumber;
                            } else {
                                textField.setText("Error");
                                return;
                            }
                            break;
                    }
                    textField.setText(String.valueOf(result));
                    input.setLength(0); // Clear input after calculation
                } catch (Exception ex) {
                    textField.setText("Error");
                    input.setLength(0);
                }
            } else if (command.equals("C")) {
                // Clear the input
                input.setLength(0);
                textField.setText("");
            } else if ("+-*/".contains(command)) {
                // Store the first number and the operator
                if (input.length() > 0) {
                    firstNumber = Double.parseDouble(input.toString());
                    operator = command;
                    input.setLength(0); // Clear input for next number
                }
            } else {
                // Append digits or decimal point
                input.append(command);
                textField.setText(input.toString());
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleCalculator calculator = new SimpleCalculator();
                calculator.setVisible(true);
            }
        });
    }
}
