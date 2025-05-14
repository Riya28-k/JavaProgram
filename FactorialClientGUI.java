import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class FactorialClientGUI extends JFrame {
    private JTextField inputField;
    private JButton sendButton;
    private JLabel resultLabel;

    public FactorialClientGUI() {
        setTitle("Factorial Client");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        inputField = new JTextField(10);
        sendButton = new JButton("Calculate");
        resultLabel = new JLabel("Result will appear here");

        add(new JLabel("Enter Number:"));
        add(inputField);
        add(sendButton);
        add(resultLabel);

        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(inputField.getText());
                    Socket socket = new Socket("10.1.138.4", 5000);

                    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                    DataInputStream in = new DataInputStream(socket.getInputStream());

                    out.writeInt(number);
                    long result = in.readLong();

                    resultLabel.setText("Factorial: " + result);
                    socket.close();
                } catch (Exception ex) {
                    resultLabel.setText("Error: " + ex.getMessage());
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new FactorialClientGUI();
    }
}
