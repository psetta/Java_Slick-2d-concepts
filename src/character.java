import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Shape;


public class character {
	public Shape bola;
	public float vel;
	
	public character (float x,  float y, float radio, float vel) {
		this.bola = new Circle(x, y, radio);
		this.vel = vel;
	}
}
