import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextStatsCounter extends JFrame implements KeyListener {

    private JTextArea textArea;
    private JLabel statsLabel;

    public TextStatsCounter() {
        setTitle("Word and Character Counter");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.addKeyListener(this);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        statsLabel = new JLabel("Characters: 0 | Words: 0");
        add(statsLabel, BorderLayout.SOUTH);
    }

    private void updateStats() {
        String text = textArea.getText();
        int charCount = text.length();

        String trimmedText = text.trim();
        int wordCount = 0;
        if (!trimmedText.isEmpty()) {
            wordCount = trimmedText.split("\\s+").length;
        }

        statsLabel.setText("Characters: " + charCount + " | Words: " + wordCount);
    }

    // KeyListener methods
    public void keyTyped(KeyEvent e) {
        updateStats();
    }

    public void keyPressed(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        TextStatsCounter frame = new TextStatsCounter();
        frame.setVisible(true);
    }
}
