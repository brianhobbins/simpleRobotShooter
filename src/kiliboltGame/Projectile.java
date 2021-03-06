package kiliboltGame;

import java.awt.Rectangle;

public class Projectile {

	private int x, y, speedX;
	private boolean visible;
	
	private Rectangle r;
	
	public Projectile(int startX, int startY){
		x = startX;
		y = startY;
		speedX = 7;
		visible = true;
		
		r = new Rectangle(0, 0, 0, 0);
	}
	
	public void update(){
		x += speedX;
		r.setBounds(x, y, 10, 5);
		if (x > 800){
			visible = false;
			r = null;
		}
		if (x < 800){
			checkCollision();
		}
	}

	private void checkCollision() {
		if(r.intersects(startingClass.hb.r)){
			visible = false;
		
			if (startingClass.hb.health > 0) {
				startingClass.hb.health -= 1;
			}
			if (startingClass.hb.health == 0) {
				startingClass.hb.setCenterX(-100);
				startingClass.score += 5;

			}

		}
		
		if (r.intersects(startingClass.hb2.r)){
			visible = false;

			if (startingClass.hb2.health > 0) {
				startingClass.hb2.health -= 1;
			}
			if (startingClass.hb2.health == 0) {
				startingClass.hb2.setCenterX(-100);
				startingClass.score += 5;

			}

		}
	}


	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getSpeedX() {
		return speedX;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	
}
