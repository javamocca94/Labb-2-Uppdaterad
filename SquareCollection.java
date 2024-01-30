import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class SquareCollection {
	
	public ArrayList<Square>squares = new ArrayList<Square>();

	public SquareCollection() {
		
		for(int i=0;i<Consts.n_bricks;i++)
			squares.add(new Square(Consts.x_brick + i*Consts.brick_dist, Consts.y_brick, Consts.w_brick, Consts.h_brick, Color.red));	
	}	
	
	public void update(Keyboard keyboard) {
				
		for(Square SC: squares) {
			if(SC.getY() >= Consts.max_y_coordinate) {
				System.exit(0);
			}
			
			SC.update(keyboard);
		}			
	}
	public void draw(Graphics2D graphics) {
		
		for(Square SC: squares)
			SC.draw(graphics);		
	}
}
	


