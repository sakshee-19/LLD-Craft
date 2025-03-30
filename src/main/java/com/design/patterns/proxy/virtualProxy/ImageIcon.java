package head.first.proxy.pattern.virtualProxy;

import java.awt.*;
import java.net.URL;

public class ImageIcon implements Icon{
    URL imageUrl;
    String name;

    public ImageIcon(URL imageUrl, String name) {
        this.imageUrl = imageUrl;
        this.name = name;
    }

    public ImageIcon() {
    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconLength() {
        return 0;
    }

    @Override
    public void paint(Component c, Graphics g, int x, int y) {

    }
}
