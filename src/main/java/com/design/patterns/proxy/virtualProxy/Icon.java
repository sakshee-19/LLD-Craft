package head.first.proxy.pattern.virtualProxy;

import java.awt.*;

public interface Icon {
    public int getIconWidth();
    public int getIconLength();
    public void paint(Component c, Graphics g, int x, int y);
}
