import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *  This program displays a red cross on a white
 *  background.
 */

public class RedCross extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        // Call JPanel's paintComponent method to paint the background
        super.paintComponent(g);
            int xCenter = getWidth()/2;
            int yCenter = getHeight()/2;
        g.setColor(Color.RED);
        // to look like the real red cross logo,
        // just keep cWeight one third of cSize
        int cSize = 360;
        int cWeight = 120; 
        g.fillRect(xCenter-cWeight/2, yCenter-cSize/2, cWeight, cSize);
        g.fillRect(xCenter-cSize/2, yCenter-cWeight/2, cSize, cWeight);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Red Cross");
        window.setBounds(300, 300, 500, 500);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RedCross panel = new RedCross();
            panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}