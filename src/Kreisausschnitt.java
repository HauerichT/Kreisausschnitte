import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

public class Kreisausschnitt extends JFrame implements ActionListener {

    // JSlider
    private JSlider slider = new JSlider(JSlider.VERTICAL, 1,10,3);

    // JButton - Start Button
    private JButton start = new JButton("Start");

    // JPanel rechte Seite
    private JPanel right = new JPanel();

    // JPanel linke Seite
    private Leinwand leinwand = new Leinwand();

    // JLabels für die Anzeige der Kreisgröße
    private JLabel size1 = new JLabel("1x1");
    private JLabel size5 = new JLabel("5x5");
    private JLabel size10 = new JLabel("10x10");

    // Hashtable für die Inhalte der Sliderbeschriftung
    private Hashtable table = new Hashtable();

    // Konstruktor
    Kreisausschnitt() {

        // setzt das Layout der rechten Seite
        right.setLayout(new BorderLayout());

        // setzt Größe und Hintergrundfarbe der Leinwand
        leinwand.setPreferredSize(new Dimension(800,800));
        leinwand.setBackground(Color.WHITE);

        // fügt Werte zur Sliderbeschriftung (Hashtable) hinzu
        table.put(1, size1);
        table.put(5, size5);
        table.put(10, size10);

        // Konfiguration des Sliders
        slider.setMajorTickSpacing(1);
        slider.setLabelTable(table);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // Start-Button ActionListener zuweisen
        start.addActionListener(this);

        // Layout zusammenbauen
        right.add(slider, BorderLayout.CENTER);
        right.add(start, BorderLayout.SOUTH);
        this.add(leinwand, BorderLayout.WEST);
        this.add(right, BorderLayout.EAST);
        pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // prüft, ob Start-Button gedrückt wurde
        if (e.getSource() == start) {
            // setzt die Anzahl der Kreise
            leinwand.setSize(slider.getValue());
            // zeichnet die Kreise in Leinwand
            leinwand.repaint();
        }

    }
}