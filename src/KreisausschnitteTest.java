import javax.swing.*;
import java.awt.*;

public class KreisausschnitteTest {
    public static void main(String[] args) {
        Kreisausschnitte gui = new Kreisausschnitte();
        gui.setTitle("Kreisausschnitt");
        gui.setPreferredSize(new Dimension(800,800));
        gui.setBackground(Color.white);
        gui.setResizable(false);
        gui.setLocationRelativeTo(null);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
    }

}
