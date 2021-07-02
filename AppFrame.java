
/**
 * GUI for Running Path Recommendation Application
 *
 * @author Anggito Anju
 * @version ver 1.0 - 2 July 21
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AppFrame implements ActionListener
{
    /* ===== PRIVATE VARIABLE FOR MAIN FRAME ===== */
    // Frame
    public JFrame mainFrame = new JFrame("Run Path Recommendation");

    // Header Panel
    private JPanel headerPanel = new JPanel();
    // Labels
    private JLabel headerTitle = new JLabel("Runner Path");

    // Map Panel
    private JPanel mapPanel = new JPanel();
    private MapCanvas map = new MapCanvas();

    // User Panel
    private JPanel userPanel = new JPanel();
    // Labels
    private JLabel srcLabel = new JLabel("Pilih tempat mulai Anda");
    private JLabel destLabel = new JLabel("Pilih tempan tujuan Anda");
    // ComboBox
    // => Crossroads
    private String crossRoads[]= {"Teknik Kimia", "Teknik Hidrodinamika", "Taman Teknologi",
        "Teknik Perkapalan", "Teknik Mesin 2", "Perpustakaan ITS", "Taman Dr. Angka", "Teknik Mesin 1",
        "Taman Alumni", "Bundaran ITS 1", "Bundaran ITS 2", "Bundaran ITS 3"};
    private JComboBox<String> srcCB = new JComboBox<String>(crossRoads);
    private JComboBox<String> destCB = new JComboBox<String>(crossRoads);
    // Text Area
    private JTextArea srcUserText = new JTextArea();
    private JTextArea destUserText = new JTextArea();
    // Button
    private JButton calcButton = new JButton("Calculate My Best Path");
    
    /* ===== UTILITY ===== */
    private Font f1 = new Font("Verdana", Font.ITALIC + Font.BOLD, 32);     // title
    private Font f2 = new Font(Font.SERIF, Font.BOLD, 18);          // calc
    private Font f3 = new Font(Font.SERIF, Font.BOLD, 18);          // buttons
    private Font f4 = new Font(Font.SERIF, Font.PLAIN, 13);         // menus

    private Color c1 = new Color(245, 163, 0);      // yellow

    /* ===== END OF UTILITY ===== */
    // Constructur for App Frame
    public AppFrame() {
        initComponents();
    }

    private void initComponents() {
        /* ========== CONTAINER SETTINGS ========== */
        mainFrame.setSize(680, 830);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* ===== ADD PANELS ===== */
        mainFrame.add(headerPanel, BorderLayout.PAGE_START);
        mainFrame.add(mapPanel, BorderLayout.LINE_START);
        mainFrame.add(userPanel, BorderLayout.LINE_END);

        /* ========== END CONTAINER SETTINGS ========== */
        
        /* ========== COMPONENTS SETTINGS ========== */
        /* ===== HEADER PANEL ===== */
        headerPanel.setBackground(c1);
        headerPanel.setPreferredSize(new Dimension(680, 80));
        headerPanel.setLayout(null);
        
        headerTitle.setBounds(30, 25, 250, 35);
        headerTitle.setFont(f1);
        headerTitle.setForeground(Color.WHITE);

        headerPanel.add(headerTitle);
        /* ===== END OF HEADER PANEL ===== */

        /* ===== MAP PANEL ===== */
        mapPanel.setBackground(Color.WHITE);
        mapPanel.setPreferredSize(new Dimension(460, 750));
        mapPanel.setLayout(null);
    
        mapPanel.add(map);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}
