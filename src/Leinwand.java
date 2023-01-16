import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Leinwand extends JPanel {

    // setzen der Größe N
    private int n;
    public void setSize(int n) {
        this.n = n;
    }

    // zeichnen der Kreise
    @Override
    protected void paintComponent(Graphics g) {
        if (n != 0 && n > 0) {

            // berechnet Fenstergröße
            int fenster = Math.min(getWidth() / n, getHeight() / n);

            // speichert x- und y-Werte
            int x = 0;
            int y = 0;

            // berechnet aktuellen Winkel
            int winkel = 360 / (n*n);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // setzt eine zufällige Farbe
                    int colorR = (int) (Math.random()*255);
                    int colorG = (int) (Math.random()*255);
                    int colorB = (int) (Math.random()*255);
                    g.setColor(new Color(colorR, colorG, colorB));

                    if (i == n && j == n) {
                        // zeichnet einen Kreis mit der größe des Fensters
                        g.fillOval(x, y, fenster, fenster);
                    }
                    else {
                        // zeichnet einen Bogen mit dem passenden Winkel
                        g.fillArc(x, y, fenster, fenster, 0 ,winkel);
                    }
                    x += fenster;
                    winkel += 360 / (n*n);
                }
                y += fenster;
                // setzt den x-Wert zurück auf 0, um das Zeichnen wieder bei 0 zu starten
                x = 0;
            }

        }

    }
}
