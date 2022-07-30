import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawingRects{
	private static class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
    		System.exit(0);
		}
		private static class DrawRect extends JPanel {
			protected void paintComponent(Graphics g) {
    			super.paintComponent(g);
    			g.drawRect(230,80,10,10);
    			g.setColor(Color.RED);
    			g.fillRect(230,80,10,10);
			}

		}
	}
}