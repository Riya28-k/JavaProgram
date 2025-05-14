import javax.swing.*;
import java.awt.event.*;

public class MouseCoordinates extends JFrame {

    JLabel coordinatesLabel;

    public MouseCoordinates() {
        setTitle("Mouse Coordinates Viewer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // absolute layout

        coordinatesLabel = new JLabel("Move the mouse in the window");
        coordinatesLabel.setBounds(100, 100, 250, 30);
        add(coordinatesLabel);

        // Mouse motion listener
        this.getContentPane().addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                coordinatesLabel.setText("Mouse Coordinates: X = " + e.getX() + ", Y = " + e.getY());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MouseCoordinates frame = new MouseCoordinates();
                frame.setVisible(true);
            }
        });
    }
}
