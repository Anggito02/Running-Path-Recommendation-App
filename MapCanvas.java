
/**
 * Map canvas for run path
 *
 * @author Anggito Anju
 * @version ver 1.0 - 2 July 21
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MapCanvas extends Canvas 
{
    @Override
    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("maps_no_weight.png");
        g.drawImage(i, 460, 750, this);
    }
}
