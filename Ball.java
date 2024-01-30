import java.awt.Color;
import java.awt.Graphics2D;

public class Ball extends Sprite {
	
	private Color color;
	public Ball ball;
	private int xSpeed, ySpeed;	

	public Ball() {
		
		super(345,200,30,30);
		this.color = Color.WHITE;
		setxSpeed(3);
		setySpeed(3);	
	}
	@Override
	public void update(Keyboard keyboard) {

		if (keyboard.isKeyDown(Key.Up)) {
			setY(getY() - getySpeed());
		}
		if (keyboard.isKeyDown(Key.Down)) {
			setY(getY() + getySpeed());
		}
		if (keyboard.isKeyDown(Key.Left)) {
			setX(getX() - getxSpeed());
		}
		if (keyboard.isKeyDown(Key.Right)) {
			setX(getX() + getxSpeed());
		}
	}
	@Override
	public void draw(Graphics2D graphics) {
		
		graphics.setColor(color);
		graphics.fillOval(getX(), getY(), getWidth(), getHeight());
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
}
