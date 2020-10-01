import javax.swing.JFrame;

public class LeagueInvaders {

	public static final int HEIGHT = 800;
	public static final int WIDTH = 500;
	JFrame frame;
	GamePanel gpanel;
	

	LeagueInvaders() {
		frame = new JFrame();
		gpanel = new GamePanel();
	}

	void setup() {
		frame.add(gpanel);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new LeagueInvaders().setup();
	}

}