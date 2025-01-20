import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *  This program displays the Target logo on a white
 *  background.
 */

public class RedTarget extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        // Call JPanel's paintComponent method to paint the background
        super.paintComponent(g);
            int xCenter = getWidth()/2;
            int yCenter = getHeight()/2;
        // to look like the real red cross logo,
        // just keep cWeight one third of cSize
        int LogoRad = 200;
        int dotNum = 3;
        int dotGap = LogoRad/dotNum;
        for (int i = 0; i < dotNum; i++) {
            if (i%2 == 0) {
                g.setColor(Color.RED);
            } else {
                g.setColor(Color.WHITE);
            }
            g.fillOval(
                xCenter-LogoRad+dotGap*i,
                yCenter-LogoRad+dotGap*i,
                2*(LogoRad-dotGap*i),
                2*(LogoRad-dotGap*i)
            );
        }
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Red Cross");
        window.setBounds(300, 300, 500, 500);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RedTarget panel = new RedTarget();
            panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}