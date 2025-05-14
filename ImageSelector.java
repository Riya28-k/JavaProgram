import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageSelector extends JFrame implements ItemListener {

    private JComboBox<String> imageComboBox;
    private JLabel imageLabel;

    private String[] imageNames = {"apple.JPEG", "banana.JPEG", "cherry.JPEG"};

    public ImageSelector() {
        setTitle("Image Selector");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        imageComboBox = new JComboBox<>(imageNames);
        imageComboBox.addItemListener(this);

        imageLabel = new JLabel("Select an image", JLabel.CENTER);

        add(imageComboBox, BorderLayout.NORTH);
        add(imageLabel, BorderLayout.CENTER);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String selectedImage = (String) imageComboBox.getSelectedItem();
            ImageIcon icon = new ImageIcon(selectedImage);

            if (icon.getIconWidth() == -1) {
                imageLabel.setText("Image not found: " + selectedImage);
                imageLabel.setIcon(null);
            } else {
                Image scaled = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
                imageLabel.setIcon(new ImageIcon(scaled));
                imageLabel.setText(null);
            }
        }
    }

    public static void main(String[] args) {
        // Java 7+ compatible without lambda
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ImageSelector frame = new ImageSelector();
                frame.setVisible(true);
            }
        });
    }
}
