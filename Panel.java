import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Panel extends JPanel {
	
	public static final int WINDOW_WIDTH = 500;
	public static final int WINDOW_HEIGHT = 500;
	// Image player;
	
	public Panel() {
		this.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
	}
	
	public void paint(Graphics g) {
		
		g.setColor(new Color(100, 100, 100));
		g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
		
		g.setColor(new Color(0, 0, 0));
		for (int i = 1; i < 3; i++) {
			g.drawLine(i * WINDOW_WIDTH / 3, 0, i * WINDOW_WIDTH / 3, WINDOW_WIDTH);
		}
		for (int i = 1; i < 3; i++) {
			g.drawLine(0, i * WINDOW_HEIGHT / 3, WINDOW_HEIGHT, i * WINDOW_HEIGHT / 3);
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (Logic.pos[i][j] == 'x') {
					g.drawImage(new ImageIcon("xplayer.png").getImage(), (i * WINDOW_WIDTH / 3 + 10), (j * WINDOW_HEIGHT / 3) + 10, null);
				} else if (Logic.pos[i][j] == 'o') {
					g.drawImage(new ImageIcon("oplayer.png").getImage(), (i * WINDOW_WIDTH / 3 + 10), (j * WINDOW_HEIGHT / 3) + 10, null);
				}
			}
		}
		
		if (Logic.checkBoard() == 'x') {
			g.setColor(new Color(150, 150, 150));
			g.fillRect((WINDOW_WIDTH / 2) - 100, (WINDOW_HEIGHT / 2) - 50, 200, 100);
			g.setColor(new Color(0, 0, 0));
			g.drawString("X wins!", (WINDOW_WIDTH / 2) - 5, WINDOW_HEIGHT / 2);
		} else if (Logic.checkBoard() == 'o') {
			g.setColor(new Color(150, 150, 150));
			g.fillRect((WINDOW_WIDTH / 2) - 100, (WINDOW_HEIGHT / 2) - 50, 200, 100);
			g.setColor(new Color(0, 0, 0));
			g.drawString("O wins!", (WINDOW_WIDTH / 2) - 5, WINDOW_HEIGHT / 2);
		} else if (Logic.checkBoard() == 'f') {
			g.setColor(new Color(150, 150, 150));
			g.fillRect((WINDOW_WIDTH / 2) - 100, (WINDOW_HEIGHT / 2) - 50, 200, 100);
			g.setColor(new Color(0, 0, 0));
			g.drawString("It's a tie!", (WINDOW_WIDTH / 2) - 5, WINDOW_HEIGHT / 2);
		}
		
		g.setColor(new Color(100, 0, 0));
		g.drawString(String.format("Turn: %s", Logic.turn), 0, 10);
	}
	public void updateWindow() {
		repaint();
	}
}