import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FactCalculator extends JFrame implements ActionListener {

    JTextField inputField;
    JButton calcButton;
    JLabel resultLabel;

    public FactCalculator() {
        setTitle("Factorial Calculator");
        setSize(350, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel promptLabel = new JLabel("Enter a number:");
        promptLabel.setBounds(30, 20, 100, 30);
        add(promptLabel);

        inputField = new JTextField();
        inputField.setBounds(140, 20, 150, 30);
        add(inputField);

        calcButton = new JButton("Calculate");
        calcButton.setBounds(100, 60, 120, 30);
        calcButton.addActionListener(this);
        add(calcButton);

        resultLabel = new JLabel("Factorial: ");
        resultLabel.setBounds(30, 100, 300, 30);
        add(resultLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(inputField.getText());
            if (num < 0) {
                resultLabel.setText("Enter a non-negative number.");
            } else {
                long fact = 1;
                for (int i = 2; i <= num; i++) {
                    fact *= i;
                }
                resultLabel.setText("Factorial of " + num + " is: " + fact);
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter a valid integer.");
        }
    }

    public static void main(String[] args) {
        new FactCalculator();
    }
}
