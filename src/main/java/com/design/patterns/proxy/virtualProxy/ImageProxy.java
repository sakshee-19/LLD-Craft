package head.first.proxy.pattern.virtualProxy;

import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon{
    volatile ImageIcon imageIcon;
    final URL url;
    Thread retrieveThread;
    boolean retrieving = false;

    public ImageProxy(URL url) {
        this.url = url;
    }

    @Override
    public int getIconWidth() {
        if(imageIcon != null){
            return imageIcon.getIconWidth();
        } else {
            return 600;
        }
    }

    @Override
    public int getIconLength() {
        if(imageIcon != null){
            return imageIcon.getIconLength();
        } else {
            return 800;
        }
    }

    public synchronized void setImageIcon(ImageIcon imageIcon){
        this.imageIcon = imageIcon;
    }

    @Override
    public void paint(final Component c, Graphics g, int x, int y) {
        if(imageIcon == null){
            g.drawString("Please wait!!.. Album is being loaded", x+300, y+190);
            if(!retrieving){
                retrieving = true;
                retrieveThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            setImageIcon(new ImageIcon(url, "ALBUM Cover"));
                            c.repaint();
                        } catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                });
                retrieveThread.start();
            }

        } else {
            imageIcon.paint(c, g, x, y);
        }
    }
}
