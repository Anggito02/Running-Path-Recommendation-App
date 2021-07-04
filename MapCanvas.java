
/**
 * Map canvas for run path
 *
 * @author Anggito Anju
 * @version ver 1.0 - 2 July 21
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MapCanvas extends JPanel
{
    MapCanvas() {
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;

        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("maps_no_weight.png");
        g2D.drawImage(i, 30, 30, this);
    }
}
