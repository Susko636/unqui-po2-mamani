package ar.edu.unq.po2.tp3;

public class Point {
	
	private float x;
	private float y;
	
	public Point(float x, float y) {
		super();
		this.setXY(x, y);
	}
	
	public Point() {
		super();
		this.setXY(0, 0);
	}
	
	public void setXY(float x, float y) {
		this.setX(x);
		this.setY(y);
	}
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public void moverPunto(float x, float y) {
		this.setXY(x, y);
	}
	
	public Point sumarPuntos(float n, float m) {
		float x = this.getX();
		float y = this.getY();
		return new Point(x+n, y+m);
	}
}
