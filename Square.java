import java.awt.Graphics2D;
import java.awt.Color;

public class Square extends Sprite{

	private Color color;
	private int xSpeed, ySpeed;
	
	public Square(int x, int y, int width, int height, Color color) {
		
		super(x, y, width, height);
		this.color = Color.RED;
		setxSpeed(0);
		setySpeed(2);
	}

	@Override
	public void update(Keyboard keyboard) {
		
		setX(getX()+getxSpeed());
		setY(getY()+getySpeed());		
	}

	@Override
	public void draw(Graphics2D graphics) {
		
		graphics.setColor(color);
		graphics.fillRect(getX(), getY(), getWidth(), getHeight());		
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

}
