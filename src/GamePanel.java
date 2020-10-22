import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	int currentState = MENU;
	Timer frameDraw;
	Rocketship rs;
	Font titleFont;
	Font subtitleFont;

	GamePanel() {
		frameDraw = new Timer(1000 / 60, this);
		frameDraw.start();
		titleFont = new Font("Arial", Font.PLAIN, 48);
		subtitleFont = new Font("Arial", Font.PLAIN, 30);
		rs = new Rocketship(250, 600, 50, 50);
	}

	void updateMenuState() {
	}

	void updateGameState() {
	}

	void updateEndState() {
	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("LEAGUE INVADERS", 10, 100);
		g.setFont(subtitleFont);
		g.setColor(Color.YELLOW);
		g.drawString("Press ENTER to start", 100, 400);
		g.setFont(subtitleFont);
		g.setColor(Color.YELLOW);
		g.drawString("Press SPACE for instructions", 50, 500);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		rs.update();
		rs.draw(g);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.BLACK);
		g.drawString("GAME OVER", 90, 300);
		g.setFont(subtitleFont);
		g.setColor(Color.BLACK);
		g.drawString("Press ENTER to play agian", 65, 350);

	}

	public void paintComponent(Graphics g) {
		if (currentState == MENU) {
			drawMenuState(g);
		} else if (currentState == GAME) {
			drawGameState(g);
		} else if (currentState == END) {
			drawEndState(g);
		}

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (currentState == MENU) {
			updateMenuState();
		} else if (currentState == GAME) {
			updateGameState();
		} else if (currentState == END) {
			updateEndState();
		}
		System.out.println("action");
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
			if (currentState == END) {
				currentState = MENU;
			} else {
				currentState++;
			}

		}
		if (arg0.getKeyCode() == KeyEvent.VK_UP) {
			System.out.println("UP");
			rs.movingUp = true;
		}
		if (arg0.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("DOWN");
			rs.movingDown = true;
		}
		if (arg0.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("LEFT");
			rs.movingLeft = true;
		}
		if (arg0.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("RIGHT");
			rs.movingRight = true;
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		if (arg0.getKeyCode() == KeyEvent.VK_UP) {
			System.out.println("UP");
			rs.movingUp = false;
		}
		if (arg0.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("DOWN");
			rs.movingDown = false;
		}
		if (arg0.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("LEFT");
			rs.movingLeft = false;
		}
		if (arg0.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("RIGHT");
			rs.movingRight = false;
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}