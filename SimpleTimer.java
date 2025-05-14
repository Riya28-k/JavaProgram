import javax.swing.*;
import java.awt.event.*;

public class SimpleTimer extends JFrame {

    private JLabel timerLabel;
    private JButton startButton;
    private JButton stopButton;

    private Timer timer;
    private int seconds = 0;

    public SimpleTimer() {
        setTitle("Simple Timer");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        timerLabel = new JLabel("Elapsed Time: 0 sec");
        timerLabel.setBounds(90, 20, 200, 30);
        add(timerLabel);

        startButton = new JButton("Start");
        startButton.setBounds(50, 70, 80, 30);
        add(startButton);

        stopButton = new JButton("Stop");
        stopButton.setBounds(150, 70, 80, 30);
        add(stopButton);

        // Timer setup (fires every 1000 ms = 1 sec)
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seconds++;
                timerLabel.setText("Elapsed Time: " + seconds + " sec");
            }
        });

        // Start button action
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });

        // Stop button action
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });
    }

    public static void main(String[] args) {
        SimpleTimer timerApp = new SimpleTimer();
        timerApp.setVisible(true);
    }
}
