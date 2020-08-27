import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	@Override
	public void paintComponent(Graphics g){
		g.fillRect(10, 10, 100, 100);
	}
	   final int MENU = 0;
	   final int GAME = 1;
	   final int END = 2;
	   
	   int currentState = MENU;
	   
	   void updateMenuState() {  }
	   void updateGameState() {  }
	   void updateEndState()  {  }
	   
	   void drawMenuState(Graphics g) {  }
	   void drawGameState(Graphics g) {  }
	   void drawEndState(Graphics g)  {  }
	   
	   if(currentState == MENU){
		    drawMenuState(g);
		}else if(currentState == GAME){
		    drawGameState(g);
		}else if(currentState == END){
		    drawEndState(g);
		}
}