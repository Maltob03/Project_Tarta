import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;


public class RoundJTextfield extends JTextField {
    private Shape shape;
    public RoundJTextfield(int size) {
        super(size);
        setOpaque(false); // As suggested by @AVD in comment.
    }
    protected void paintComponent(Graphics g) {
         g.setColor(new Color(190,208,244));
         g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
         super.paintComponent(g);
    }
    protected void paintBorder(Graphics g) {
         g.setColor(new Color(190,208,244));
         g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
    }
    
    public boolean contains(int x, int y) {
         if (shape == null || !shape.getBounds().equals(getBounds())) {
             shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
         }
         return shape.contains(x, y);
    }
    
}
