import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BackgroundColorChanger extends JFrame implements ItemListener {

    private JComboBox<String> colorComboBox;
    private JPanel mainPanel;

    public BackgroundColorChanger() {
        setTitle("Background Color Changer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create a panel whose background will change
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
        add(mainPanel, BorderLayout.CENTER);

        // ComboBox with color names
        String[] colors = {"White", "Red", "Green", "Blue", "Yellow", "Cyan", "Pink"};
        colorComboBox = new JComboBox<>(colors);
        colorComboBox.addItemListener(this);
        add(colorComboBox, BorderLayout.NORTH);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String selectedColor = (String) colorComboBox.getSelectedItem();
            switch (selectedColor) {
                case "Red":
                    mainPanel.setBackground(Color.RED);
                    break;
                case "Green":
                    mainPanel.setBackground(Color.GREEN);
                    break;
                case "Blue":
                    mainPanel.setBackground(Color.BLUE);
                    break;
                case "Yellow":
                    mainPanel.setBackground(Color.YELLOW);
                    break;
                case "Cyan":
                    mainPanel.setBackground(Color.CYAN);
                    break;
                case "Pink":
                    mainPanel.setBackground(Color.PINK);
                    break;
                default:
                    mainPanel.setBackground(Color.WHITE);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        // Run GUI safely on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                BackgroundColorChanger frame = new BackgroundColorChanger();
                frame.setVisible(true);
            }
        });
    }
}
