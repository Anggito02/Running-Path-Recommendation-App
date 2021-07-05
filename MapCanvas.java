
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
    private ImageIcon mapImage;
    private JLabel label1;

    MapCanvas() {
        setLayout(new FlowLayout());

        mapImage = new ImageIcon(getClass().getResource("maps_no_weight.png"));

        label1 = new JLabel(mapImage);
        add(label1);
    }
}
