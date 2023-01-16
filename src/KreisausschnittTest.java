import javax.swing.*;
import java.awt.*;

public class KreisausschnittTest {
    public static void main(String[] args) {
        Kreisausschnitt gui = new Kreisausschnitt();
        gui.setTitle("Kreisausschnitt");
        gui.setPreferredSize(new Dimension(800,800));
        gui.setBackground(Color.white);
        gui.setResizable(false);
        gui.setLocationRelativeTo(null);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
    }

}
