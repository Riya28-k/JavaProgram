import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BouncingBall extends JPanel implements MouseListener {
    private int x = 100, y = 100, diameter = 30;
    private int dx = 2, dy = 2;
    private boolean start = false;

    public BouncingBall() {
        addMouseListener(this);
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.WHITE);
        new Thread(new BallRunnable()).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (start) {
            g.setColor(Color.BLUE);
            g.fillOval(x, y, diameter, diameter);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        start = true;  // Start the ball movement when mouse is pressed
    }

    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}

    private class BallRunnable implements Runnable {
        @Override
        public void run() {
            while (true) {
                if (start) {
                    // Move the ball
                    x += dx;
                    y += dy;

                    // Bounce off the edges
                    if (x <= 0 || x >= getWidth() - diameter) {
                        dx = -dx;
                    }
                    if (y <= 0 || y >= getHeight() - diameter) {
                        dy = -dy;
                    }

                    // Repaint the panel
                    repaint();
                    try {
                        Thread.sleep(10);  // Delay to control the speed
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball");
        BouncingBall panel = new BouncingBall();
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
