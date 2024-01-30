import java.awt.Color;
import java.awt.Graphics2D;
import java.util.*;

public class Game {
	
	private Ball ball;
	private SquareCollection bricks;
		
	public Game(GameBoard board) {
		
		ball = new Ball();
		bricks = new SquareCollection();								
	}

	public void update(Keyboard keyboard) {
				
		ball.update(keyboard);
		bricks.update(keyboard);		
	}

	public void draw(Graphics2D graphics) {	
		
		ball.draw(graphics);
		bricks.draw(graphics);
	}		
}
