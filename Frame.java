import javax.security.auth.login.LoginContext;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame implements MouseListener {
	
	private double i = 0.0;
	
	Color c = new Color(10, 10, 10);
	Panel panel = new Panel();
	
	public Frame() {
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setTitle("Tic Tac Toe");
		this.addMouseListener(this);
		this.setVisible(true);
		// panel.updateWindow();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		;
	}
	
	@Override
 	public void mouseEntered(MouseEvent e) {
		;
	}
 	
 	@Override
 	public void mouseExited(MouseEvent e) {
 		;
 	}
 	
 	@Override
 	public void mouseClicked(MouseEvent e) {
 		;
 	}
 	
 	@Override
 	public void mouseReleased(MouseEvent e) {
 		if (Logic.checkBoard() == 'e') {
 			Logic.setBoard((e.getX() - 8) / (Panel.WINDOW_WIDTH / 3), (e.getY() - 32) / (Panel.WINDOW_HEIGHT/ 3));
 	 		panel.updateWindow();
 	 		Logic.checkBoard();
 		} else {
 			for (int i = 0; i < 3; i++) {
 				for (int j = 0; j < 3; j++) {
 					Logic.pos[i][j] = 0;
 				}
 			}
 			panel.updateWindow();
 			Logic.checkBoard();
 		}
 	}
}
