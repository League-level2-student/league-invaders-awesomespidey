import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Rocketship extends GameObject {

	public boolean movingUp, movingDown, movingRight, movingLeft;
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	
	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 10;
	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}

	public void right() {
		if (x < LeagueInvaders.WIDTH - width) {
			x += speed;
		}
	}

	public void left() {
		if (x > 0) {
			x -= speed;
		}
	}

	public void up() {
		if (y > 0) {
			y -= speed;
		}
	}

	public void down() {
		if (y < LeagueInvaders.HEIGHT - height) {
			y += speed;
		}
	}

	void update() {
		if (movingUp)
			up();
		if (movingDown)
			down();
		if (movingRight)
			right();
		if (movingLeft)
			left();
	}
}
