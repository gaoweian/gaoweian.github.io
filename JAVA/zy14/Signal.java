import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
 
public class Signal extends Applet {
    int width = 200, height = 240;
    int w = 50, h = 50;
    int x = (width - w) / 2, y1 = (height - h * 3) / 3, y2 = y1 + h, y3 = y2 + h;
    Color c = Color.RED;
 
    @Override
    public void init() {
        ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);
        exec.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                if (c == Color.RED) {
                    c = Color.YELLOW;
                } else if (c == Color.YELLOW) {
                    c = Color.GREEN;
                } else if (c == Color.GREEN) {
                    c = Color.RED;
                }
                repaint();
            }
        }, 5, 5, TimeUnit.SECONDS);
    }
 
    @Override
    public void paint(Graphics g) {
        setBackground(Color.white);
 
        // all gray
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(x, y1, w, h);
        g.fillOval(x, y2, w, h);
        g.fillOval(x, y3, w, h);
 
        if (c == Color.RED) {
            g.setColor(Color.RED);
            g.fillOval(x, y1, w, h);
        } else if (c == Color.YELLOW) {
            g.setColor(Color.YELLOW);
            g.fillOval(x, y2, w, h);
        } else if (c == Color.GREEN) {
            g.setColor(Color.GREEN);
            g.fillOval(x, y3, w, h);
        }
    }
}